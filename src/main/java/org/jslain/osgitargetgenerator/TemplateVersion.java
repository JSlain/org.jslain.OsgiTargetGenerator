package org.jslain.osgitargetgenerator;

/**
 * Versions of the PDE file generated
 * 
 * @author JSlain (Ghislain Nadeau)
 *
 */
public enum TemplateVersion {
	
	/** Version 3.8 */
	PDE_3_8("template_3_8.xml")
	;
	
	private String filename;
	
	private TemplateVersion(String filename){
		this.filename= filename;
	}
	
	public String getFilename(){
		return filename;
	}
}
