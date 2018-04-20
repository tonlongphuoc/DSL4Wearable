package iotwearable.gen.test;

import static org.junit.Assert.assertEquals;
import iotwearable.gen.generator.WifiESP8266Generator;
import iotwearable.model.iotw.WifiESP8266;

public class WifiESP8266GeneratorTest extends ConnectivityTest{
	WifiESP8266Generator generator = new WifiESP8266Generator((WifiESP8266)getConnectivityControl(WifiESP8266.class));
	@Override
	public void generateInclude() {
		String expected = "#include <SoftwareSerial.h>\n"
				+ "#include <SerialCommand.h>\n"
				+ "#include <ESP8266WiFi.h>\n"
				+ "#include <SocketIOClient.h>";
		assertEquals(expected, generator.generateInclude());
	}

	@Override
	public void generateDefine() {
		String expected = "/*Define Wifi ESP8266 - wifi */\n";
		expected +="SoftwareSerial wifi(1, 0);\n";
		expected+="SerialCommand sCmd(wifi);\n";
		expected+="SocketIOClient client;\n"
				+ "const char* ssid = \"IotWearable\";\n"
				+ "const char* password = \"IotWearable\";\n"
				+ "char host[] = \"192.168.200.46\";\n"
				+ "int port = 3484;\n";  
		assertEquals(expected, generator.generateDefine());
	}

	@Override
	public void generateSetupFuncSetup() {

	}

	@Override
	public void generateSetupFuncLoop() {

	}

	@Override
	public void generateCommand() {

	}

}
