package iotwearable.gen.test;

import static org.junit.Assert.*;
import iotwearable.gen.generator.BluetoothHC06Generator;
import iotwearable.model.iotw.BluetoothHC06;

import org.junit.Test;

public class BluetoothHC06GeneratorTest extends ConnectivityTest{
	BluetoothHC06Generator generator = new BluetoothHC06Generator((BluetoothHC06)getConnectivityControl(BluetoothHC06.class));

	@Test
	public void generateDefine() {
		String expected = "/*Define Bluetooth HC06 - bluetooth */\n"
				+ "SoftwareSerial bluetooth(13, 12);\n"
				+ "int baudRate[] = {300, 1200, 2400, 4800, 9600, 19200, 38400, 57600, 115200};\n";
		assertEquals(expected, generator.generateDefine());
	}

	@Test
	public void generateInclude() {
		String expected = "#include <SoftwareSerial.h>";
		assertEquals(expected, generator.generateInclude());
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
