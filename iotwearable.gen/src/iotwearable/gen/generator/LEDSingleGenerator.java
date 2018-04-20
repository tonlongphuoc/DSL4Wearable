package iotwearable.gen.generator;

import iotwearable.model.iotw.LED;

public class LEDSingleGenerator extends LEDGenerator{
	LED led;
	
	public LEDSingleGenerator(LED led) {
		this.led = led;
	}
	
	@Override
	public String generateDefine() {
		return super.generateDefine()
				.replaceAll("<id>", led.getId())
				.replaceAll("<pin>", led.getMainboard()
						.findPin(led.getPinConnecteds().get(0))
						.getName());
	}
	@Override
	public String generateSetupFuncSetup() {
		return super.generateSetupFuncSetup()
				.replaceAll("<id>", led.getId());
	}
}
