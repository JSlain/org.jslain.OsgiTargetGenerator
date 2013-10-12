package org.jslain.osgitargetgenerator.impl;

import java.io.File;
import java.util.List;

import org.jslain.osgitargetgenerator.TemplateVersion;

import com.lexicalscope.jewel.cli.Option;

public interface SpecificParams {
	@Option(description="Name of the target, will be displayed in Eclipse.",
			shortName = "n",
			defaultValue={"Generated Target"})
	String name();
	
	@Option(description="List of folders to be scanned to find bundles.",
			shortName = "s")
	List<File> sourceFolders();
	
	@Option(description="Output file.",
			shortName = "o",
			defaultValue={"generated.target"})
	File output();
	
	@Option(description="PDE version of the file being generated.",
			shortName = "v",
			defaultValue={"PDE_3_8"})
	TemplateVersion targetVersion();
	
	@Option(helpRequest = true, description = "display help", shortName = "h") 
	boolean getHelp();
}
