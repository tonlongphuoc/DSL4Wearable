package iotwearable.gen.analyzer;

import iotwearable.gen.CodeWriter;
import iotwearable.gen.generator.GeneratorFactory;
import iotwearable.gen.generator.IDevicesGenerator;
import iotwearable.model.iotw.ConnectivityControl;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.Mainboard;

/**
 * 
 * Analysis of the devices connected to the mainboard,
 * generates the source code for the {@linkplain include},
 * {@linkplain define} the device and the setups
 *
 */
public class DevicesAnalyzer {
	/*
	 * 1. For each the control connected to mainboard.
	 * 2. Generate code
	 * <include> and write into source code
	 * 3. Generate code <define> the device
	 * and write into source code
	 */
	public String analyze(Mainboard mainboard, String src) {
		for (IOControl control : mainboard.getControls()) {
			IDevicesGenerator generator = GeneratorFactory.create(control);
			String include = generator.generateInclude();
			if(include.contains("\n")){
				String[] includes = include.split("\n");
				for(String _include : includes){
					if (!src.contains(_include)) {
						src = CodeWriter.write(src, _include, CodeWriter.include);
					}
				}
			}
			else{
				if (!src.contains(include)) {
					src = CodeWriter.write(src, include, CodeWriter.include);
				}
			}
			src = CodeWriter.write(src,
					generator.generateDefine(), CodeWriter.define);
			src = CodeWriter.write(src,
					generator.generateSetupFuncSetup(), CodeWriter.funcSetup);
			src = CodeWriter.write(src,
					generator.generateSetupFuncLoop(), CodeWriter.funcLoop);
		}
		for(ConnectivityControl connectivityControl : mainboard.getConnectivities())
		{
			IDevicesGenerator generator = GeneratorFactory.create(connectivityControl);
			String include = generator.generateInclude();
			if(include.contains("\n")){
				String[] includes = include.split("\n");
				for(String _include : includes){
					if (!src.contains(_include)) {
						src = CodeWriter.write(src, _include, CodeWriter.include);
					}
				}
			}
			else{
				if (!src.contains(include)) {
					src = CodeWriter.write(src, include, CodeWriter.include);
				}
			}
			src = CodeWriter.write(src,
					generator.generateDefine(), CodeWriter.define);
			src = CodeWriter.write(src,
					generator.generateSetupFuncSetup(), CodeWriter.funcSetup);
			src = CodeWriter.write(src,
					generator.generateSetupFuncLoop(), CodeWriter.funcLoop);
		}
		return src;
	}
}