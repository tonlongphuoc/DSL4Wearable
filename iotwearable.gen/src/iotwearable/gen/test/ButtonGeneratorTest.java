package iotwearable.gen.test;

import static org.junit.Assert.*;
import iotwearable.gen.generator.ButtonGenerator;
import iotwearable.model.iotw.Button;

import org.junit.Test;

public class ButtonGeneratorTest extends IOGeneratorTest{
	ButtonGenerator generator = new ButtonGenerator((Button)getIOControl(Button.class));
	@Test
	public void generateInclude() {

	}

	@Test
	public void generateDefine() {
	String expected ="/*Define buzzer - button output*/\n"
			+ "const int button = 13;";
	assertEquals(expected, generator.generateDefine());

	}

	@Override
	public void generateSetupFuncSetup() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generateSetupFuncLoop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generateCommand() {
		// TODO Auto-generated method stub

	}

}
