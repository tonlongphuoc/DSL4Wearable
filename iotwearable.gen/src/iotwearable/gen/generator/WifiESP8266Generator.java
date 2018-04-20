package iotwearable.gen.generator;

import iotwearable.model.iotw.WifiESP8266;

public class WifiESP8266Generator extends WifiGenerator {
	private WifiESP8266 wifiESP8266;
	public WifiESP8266Generator(WifiESP8266 wifiESP8266) {
		this.wifiESP8266= wifiESP8266;
	}
	@Override
	public String generateDefine() {
		String content = super.generateDefine();
		content = content.replaceAll("<pinTX>", wifiESP8266.getMainboard().findPin(wifiESP8266.getPinTX()).getName())
				.replaceAll("<pinRX>", wifiESP8266.getMainboard().findPin(wifiESP8266.getPinRX()).getName())
				.replaceAll("<id>", wifiESP8266.getId())
				.replaceAll("<type>", wifiESP8266.getName())
				.replaceAll("<SSID>", wifiESP8266.getSSID())
				.replaceAll("<Password>", wifiESP8266.getPassword())
				.replaceAll("<Host>",wifiESP8266.getHost())
				.replaceAll("<Port>", wifiESP8266.getPort()+"");
		return content;
	}

}
