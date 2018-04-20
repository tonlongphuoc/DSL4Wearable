package iotwearable.gen.test;

import java.io.File;

import iotwearable.gen.ModelConverter;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StateSchema;

import org.junit.Test;

public abstract class IOGeneratorTest{
	Mainboard mainboard;
	StateSchema schema;
	public IOGeneratorTest() {
		File root = new File("");
		String pathMainboard = root.getAbsoluteFile()
				+ "\\src\\iotwearable\\gen\\test\\Mainboard.iotw";
		mainboard = ModelConverter.convertToMainboard(pathMainboard);
		String pathSchema = root.getAbsoluteFile()
				+ "\\src\\iotwearable\\gen\\test\\StateSchema.iotw";
		mainboard = ModelConverter.convertToMainboard(pathMainboard);
		schema = ModelConverter.convertToStateSchema(pathSchema);
	}
	IOControl getIOControl(Class<?> object){
		for(IOControl control : mainboard.getControls()){
			if(object.isInstance(control)){
				return control;
			}
		}
		return null;
	}
	@Test
	abstract public void generateInclude();
	@Test
	abstract public void generateDefine();
	@Test
	abstract public void generateSetupFuncSetup();
	@Test
	abstract public void generateSetupFuncLoop();
	@Test
	abstract public void generateCommand();
}
