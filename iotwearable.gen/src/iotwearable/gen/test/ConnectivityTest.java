package iotwearable.gen.test;

import iotwearable.gen.ModelConverter;
import iotwearable.model.iotw.ConnectivityControl;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StateSchema;

import java.io.File;

import org.junit.Test;

public abstract class ConnectivityTest {
	Mainboard mainboard;
	StateSchema schema;
	public ConnectivityTest() {
		File root = new File("");
		String pathMainboard = root.getAbsoluteFile()
				+ "\\src\\iotwearable\\gen\\test\\Connectivity.iotw";
		mainboard = ModelConverter.convertToMainboard(pathMainboard);
		String pathSchema = root.getAbsoluteFile()
				+ "\\src\\iotwearable\\gen\\test\\StateSchema.iotw";
		mainboard = ModelConverter.convertToMainboard(pathMainboard);
		schema = ModelConverter.convertToStateSchema(pathSchema);
	}
	ConnectivityControl getConnectivityControl (Class<?> object)
	{
		for(ConnectivityControl control : mainboard.getConnectivities()){
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