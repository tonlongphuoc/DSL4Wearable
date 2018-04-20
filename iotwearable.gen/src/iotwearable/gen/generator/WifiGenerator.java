package iotwearable.gen.generator;

import iotwearable.gen.analyzer.Token;
import iotwearable.gen.utilities.LibraryNameUtil;

import java.util.List;

public class WifiGenerator extends DevicesGenerator{


	@Override
	public String generateInclude() {
		return createInclude(LibraryNameUtil.SoftwareSerial)+"\n" 
				+ createInclude(LibraryNameUtil.SerialCommand)+"\n"+
				createInclude(LibraryNameUtil.ESP8266WiFi)+"\n"
				+ createInclude(LibraryNameUtil.SocketIOClient);
	}

	@Override
	public String generateDefine() {
		String content = "/*Define Wifi <type> - <id> */\n";
		content +="SoftwareSerial <id>(<pinRX>, <pinTX>);\n";
		content+="SerialCommand sCmd(<id>);\n";
		content+="SocketIOClient client;\n"
				+ "const char* ssid = \"<SSID>\";\n"
				+ "const char* password = \"<Password>\";\n"
				+ "char host[] = \"<Host>\";\n"
				+ "int port = <Port>;\n";  
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
