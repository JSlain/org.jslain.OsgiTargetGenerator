package org.jslain.osgitargetgenerator;

import org.jslain.osgitargetgenerator.impl.SpecificParams;

import com.lexicalscope.jewel.cli.CliFactory;

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
		
		TargetData data = dataFromArgs(args);
		
		Proceeder proc = new Proceeder();
		proc.proceed(data);
	}
	
	private static TargetData dataFromArgs(String[] args){
		TargetData toReturn = new TargetData();
		
		SpecificParams params = CliFactory.parseArguments(SpecificParams.class, args);
		
		toReturn.setSourceFolders(params.sourceFolders());
		toReturn.setOutput(params.output());
		toReturn.setName(params.name());
		toReturn.setTemplateVersion(params.targetVersion());
		
		return toReturn;
	}
}
