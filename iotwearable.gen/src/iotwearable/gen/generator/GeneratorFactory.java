package iotwearable.gen.generator;

import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.Buzzer;
import iotwearable.model.iotw.Control;
import iotwearable.model.iotw.I2CLCD2004;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.LED;
import iotwearable.model.iotw.WifiESP8266;

public class GeneratorFactory{
	public static IDevicesGenerator create(Control control){
		IDevicesGenerator generator = null;
		//area output
		if(control instanceof LED){
			generator =  new LEDSingleGenerator((LED)control);
		}
		else if(control instanceof I2CLCD2004){
			generator = new I2CLCD2004Generator((I2CLCD2004)control);
		}
		else if(control instanceof Buzzer){
			generator = new BuzzerGenerator((Buzzer)control);
		}
		//area input
		else if(control instanceof Keypad4x4){
			generator = new Keypad4x4Generator((Keypad4x4)control);
		}
		else if(control instanceof Button)
		{
			generator = new ButtonGenerator((Button) control);
		}
		// area connectivity
		else if(control instanceof BluetoothHC06)
		{
			generator = new BluetoothHC06Generator((BluetoothHC06) control);
		}
		else if( control instanceof WifiESP8266)
		{
			generator = new  WifiESP8266Generator((WifiESP8266) control);
		}
		return generator;
	}
}
