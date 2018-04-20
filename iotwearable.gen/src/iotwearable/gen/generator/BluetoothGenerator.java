package iotwearable.gen.generator;

import iotwearable.gen.analyzer.Token;
import iotwearable.gen.utilities.LibraryNameUtil;

import java.util.List;

public class BluetoothGenerator extends DevicesGenerator{

	@Override
	public String generateInclude() {
		return createInclude(LibraryNameUtil.SoftwareSerial);
	}

	@Override
	public String generateDefine() {
		String content = "/*Define Bluetooth <type> - <id> */\n";
		content +="SoftwareSerial <id>(<pinRX>, <pinTX>);\n";
		content+="int baudRate[] = {300, 1200, 2400, 4800, 9600, 19200, 38400, 57600, 115200};\n";
		return content;
	}

	@Override
	public String generateSetupFuncSetup() {
		return "";
	}

	@Override
	public String generateSetupFuncLoop() {
		return "";
	}

	@Override
	public String generateCommand(String syntax, List<Token> tokens) {
		return "";
	}

}
