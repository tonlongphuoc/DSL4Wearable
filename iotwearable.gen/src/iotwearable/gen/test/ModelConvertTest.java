package iotwearable.gen.test;

import static org.junit.Assert.assertEquals;
import iotwearable.gen.ModelConverter;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.LED;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StartPoint;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateFrame;
import iotwearable.model.iotw.StateSchema;
import iotwearable.model.iotw.impl.Keypad4x4Impl;
import iotwearable.model.iotw.impl.LEDImpl;
import iotwearable.model.iotw.impl.StartPointImpl;
import iotwearable.model.iotw.impl.StateFrameImpl;

import java.io.File;

import org.junit.Test;

public class ModelConvertTest {
	@Test
	public void convertToMainboardTest() {
		File root = new File("");
		String path = root.getAbsoluteFile()
				+ "\\src\\iotwearable\\gen\\test\\Mainboard.iotw";
		Mainboard mainboard = ModelConverter.convertToMainboard(path);
		if (mainboard != null) {
			for(IOControl control : mainboard.getControls()){
				if(control instanceof LED)
					assertEquals(LEDImpl.class, control.getClass());
				if(control instanceof Keypad4x4)
					assertEquals(Keypad4x4Impl.class, control.getClass());
			}
		}
	}
	
	@Test
	public void convertToStateSchemaTest() {
		File root = new File("");
		String path = root.getAbsoluteFile()
				+ "\\src\\iotwearable\\gen\\test\\StateSchema.iotw";
		StateSchema schema = ModelConverter.convertToStateSchema(path);
		if (schema != null) {
			for(StateControl control : schema.getControls()){
				if(control instanceof StartPoint)
					assertEquals(StartPointImpl.class, control.getClass());
				if(control instanceof StateFrame)
					assertEquals(StateFrameImpl.class, control.getClass());
			}
		}
	}
}
