package iotwearable.gen.generator;

import iotwearable.gen.utilities.LibraryNameUtil;

public abstract class DevicesGenerator implements IDevicesGenerator{
	protected String createInclude(LibraryNameUtil libName){
		return "#include <" + libName.toString() + ".h>";
	}
}