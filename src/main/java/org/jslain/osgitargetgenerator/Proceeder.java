package org.jslain.osgitargetgenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

/**
 * This class receives the TargetData and generate the .target file.
 * 
 * @author JSlain (Ghislain Nadeau)
 */
public class Proceeder {
	private static final String VAR_NAME = "%NAME%";
	
	private static final String VAR_LOCATIONS = "%LOCATIONS%";
	
	private static final String VAR_PATH = "%PATH%";
	
	private static final String LOCATION_TEMPLATE = "    <location path=\"%PATH%\" type=\"Directory\"/>";
	

	public void proceed(TargetData data) throws IOException{
		InputStream is = Proceeder.class.getResourceAsStream(data.getTemplateVersion().getFilename());
		
		String template = IOUtils.toString(is);
		
		//Name
		template = template.replace(VAR_NAME, data.getName());
		
		//Locations
		String locations = "";
		for(File f : scanFolder(data.getFrameworkRoot())){
			locations += LOCATION_TEMPLATE.replace(VAR_PATH, f.getAbsolutePath()) + "\r\n";
		}
		template = template.replace(VAR_LOCATIONS, locations);
		
		FileOutputStream fos = null;
		try{
			data.getOutput().delete();
			
			fos = new FileOutputStream(data.getOutput());
			IOUtils.write(template, fos);
		}finally{
			if(fos != null){
				fos.close();
			}
		}
		
	}
	
	private List<File> scanFolder(File folder){
		List<File> toReturn = new ArrayList<File>();
		
		scanFolder(folder, toReturn);
		
		return toReturn;
	}
	
	private void scanFolder(File folder, List<File> fill){
		boolean found = false;
		
		for(File f : folder.listFiles()){
			if(f.isAbsolute()){
				if(f.isDirectory()){
					scanFolder(f, fill);
				}else{
					if(f.getName().toUpperCase().endsWith(".JAR")){
						found = true;
					}
				}
			}
		}
		
		if(found){
			fill.add(folder);
		}
	}
}

