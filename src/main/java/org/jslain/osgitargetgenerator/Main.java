package org.jslain.osgitargetgenerator;

import java.io.File;

/**
 * Main class, only contains a main() method, for rapid use of the tool.
 * Just change the parameters so it targets a valid framework/server root folder to be scanned, an output filename and a name for the target.
 * Should be deleted when some TargetData provider would be implemented.
 * 
 * @author JSlain (Ghislain Nadeau)
 *
 */
public class Main {

	public static void main(String[] args) throws Exception{
		TargetData data = new TargetData();
		data.setFrameworkRoot(new File("/Users/necrosado/Downloads/apache-servicemix-4.5.2")); //Change to the folder you'ld like to generate target
		data.setOutput(new File("./newtarget.target"));
		data.setName("MyNewTarget");
		data.setTemplateVersion(TemplateVersion.PDE_3_8);
		
		Proceeder proc = new Proceeder();
		proc.proceed(data);
	}
}
