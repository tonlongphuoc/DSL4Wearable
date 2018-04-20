package iotwearable.gen.generator;

import iotwearable.gen.analyzer.Token;
import iotwearable.model.iotw.BluetoothHC06;

import java.util.List;

public class BluetoothHC06Generator extends BluetoothGenerator {
	private BluetoothHC06 bluetoothHC06;

	public BluetoothHC06Generator(BluetoothHC06 bluetoothHC06) {
		this.bluetoothHC06 = bluetoothHC06;
	}


	@Override
	public String generateDefine() {
		String content = super.generateDefine();
		content = content.replaceAll("<pinTX>", bluetoothHC06.getMainboard().findPin(bluetoothHC06.getPinTXD()).getName())
		.replaceAll("<pinRX>", bluetoothHC06.getMainboard().findPin(bluetoothHC06.getPinRXD()).getName())
		.replaceAll("<id>", bluetoothHC06.getId())
		.replaceAll("<type>", bluetoothHC06.getName());
		
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
