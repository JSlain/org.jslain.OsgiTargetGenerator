package org.jslain.osgitargetgenerator;

import java.io.File;

/**
 * Dto that contains informations about the source and the target.
 * The Proceeder will use these informations to scan for bundles and produce a target file.
 * 
 * @author JSlain (Ghislain Nadeau)
 *
 */
public class TargetData {

	/** Name of the target (will be visible in Eclipse as the Target Name) */
	private String name;
	
	/** Root folder of the framework to be scanned for bundles. */
	private File frameworkRoot;
	
	/** Output target file. */
	private File output;

	/** Version of the generated file */
	private TemplateVersion templateVersion;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getFrameworkRoot() {
		return frameworkRoot;
	}

	public void setFrameworkRoot(File frameworkRoot) {
		this.frameworkRoot = frameworkRoot;
	}

	public File getOutput() {
		return output;
	}

	public void setOutput(File output) {
		this.output = output;
	}

	public TemplateVersion getTemplateVersion() {
		return templateVersion;
	}

	public void setTemplateVersion(TemplateVersion templateVersion) {
		this.templateVersion = templateVersion;
	}
}
