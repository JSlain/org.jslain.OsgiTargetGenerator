org.jslain.OsgiTargetGenerator
==============================

A little tool to generate an Eclipse .target file from a framework folder (scanning subfolders).

By default, i found adding a Target Platform a little hard if you don't have a simple folder containing all your bundles.
If you want to build an Enterprise OSGI using a complex container which provides you bundles using a tree-folders based 
way, you might find it takes alot of time to select each subfolders one-by-one.

This little tool helps, by having you selecting a folder to be scanned for subfolder containing .jar files and then create 
a  .target file compatible with Eclipse.

Usage:
java -jar OsgiTargetGenerator-[version]-jar-with-dependencies.jar --name MyTarget --output my.target 
--sourceFolders ~/MyFramework --targetVersion PDE_3_8


Result of 'java -jar OsgiTargetGenerator-[version]-jar-with-dependencies.jar --help':
...
The options available are:
	[--help -h] : display help
	[--name -n value] : Name of the target, will be displayed in Eclipse.
	[--output -o value] : Output file.
	--sourceFolders -s value... : List of folders to be scanned to find bundles.
	[--targetVersion -v value] : PDE version of the file being generated.
...
