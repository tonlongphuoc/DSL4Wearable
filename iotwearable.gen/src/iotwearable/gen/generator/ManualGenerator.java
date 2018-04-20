package iotwearable.gen.generator;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.Buzzer;
import iotwearable.model.iotw.ConnectivityControl;
import iotwearable.model.iotw.I2CLCD2004;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.LED;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.WifiESP8266;
import iotwearable.utilities.FileUtils;

public class ManualGenerator {
	private Mainboard mainboard;
	String html;
	public ManualGenerator(Mainboard mainboard) {
		this.mainboard = mainboard;
		this.html="";
	}
	public String generatorManual(String title){
		String path = this.getClass().getProtectionDomain().getCodeSource()
				.getLocation().getPath()
				+ "\\src\\iotwearable\\gen\\generator\\manual.html";
		try {
			html = FileUtils.readFile(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Date today=new Date(System.currentTimeMillis());
		SimpleDateFormat timeFormat= new SimpleDateFormat("dd/MM/yyyy");
		String s=timeFormat.format(today.getTime());
		html = html.replace("<!--_title-->", title);
		html = html.replace("<!--dateGenCode-->",s);
		html = html.replace("<!--device-->", genListControl());
		html = html.replace("<!--details-->", genManualConnect());
		return html;
	}
	private String genManualConnect()
	{
		String manual="";
		for(Pin pin: mainboard.getPinConnecteds())
		{
			ArrayList<String> control = new ArrayList<String>();
			control = getControl(pin.getIdConnect());
			manual+= "<tr>\n"
					+ "<td>"+control.get(0)+"</td>\n"
					+ "<td>"+control.get(1)+"</td>\n"
					+ "<td>"+pin.getName()+"</td>\n"
					+ "</tr>\n";
		}
		for(IOControl control : mainboard.getControls())
		{
			if(control instanceof Keypad4x4)
			{
				manual = manual.replace("<td>"+control.getName()+"</td>", "<!--Keypad4x4-->");
				manual = manual.replaceFirst("<!--Keypad4x4-->","<td rowspan=8>"+control.getName()+"</td>\n" );
			}
			if(control instanceof I2CLCD2004)
			{
				manual = manual.replace("<td>"+control.getName()+"</td>", "<!--I2CLCD2004-->");
				manual = manual.replaceFirst("<!--I2CLCD2004-->","<td rowspan=2>"+control.getName()+"</td>\n" );
			}
		}
		for(ConnectivityControl connectivityControl : mainboard.getConnectivities())
		{
			if(connectivityControl instanceof BluetoothHC06)
			{
				manual = manual.replace("<td>"+connectivityControl.getName()+"</td>", "<!--BluetoothHC06-->");
				manual = manual.replaceFirst("<!--BluetoothHC06-->","<td rowspan=2>"+connectivityControl.getName()+"</td>\n" );
			}
			if(connectivityControl instanceof WifiESP8266)
			{
				manual = manual.replace("<td>"+connectivityControl.getName()+"</td>", "<!--WifiESP8266-->");
				manual = manual.replaceFirst("<!--WifiESP8266-->","<td rowspan=2>"+connectivityControl.getName()+"</td>\n" );
			}
		}
		return manual;
	}
	private ArrayList<String> getControl(String idConnect)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		for(IOControl control: mainboard.getControls())
		{
			for(Pin pin: control.getPinConnecteds())
			{
				if(pin.getIdConnect().equals(idConnect))
				{
					arrayList.add(control.getName());
					arrayList.add(pin.getName());
				}
			}
		}
		for(ConnectivityControl control: mainboard.getConnectivities())
		{
			for(Pin pin: control.getPinConnecteds())
			{
				if(pin.getIdConnect().equals(idConnect))
				{
					arrayList.add(control.getName());
					arrayList.add(pin.getName());
				}
			}
		}
		return arrayList;
	}

	private String genListControl()
	{
		String listControl="";
		int countLED=0, countLCD=0, countKeypad=0, countBuzzer=0, countBluetooth =0, countWifi =0, countButton=0;
		String typeLED="", typeLCD="", typeKeypad="", typeBuzzer="", typeBluetooth ="", typeWifi="", typeButton="";
		for(IOControl control: mainboard.getControls())
		{
			if(control instanceof LED)
			{
				countLED++;
				typeLED=control.getName();
			}

			else if(control instanceof I2CLCD2004)
			{
				typeLCD = control.getName();				
				countLCD++;
			}
			else if(control instanceof Keypad4x4)
			{
				typeKeypad = control.getName();				
				countKeypad++;
			}
			else if(control instanceof Buzzer)
			{
				typeBuzzer = control.getName();
				countBuzzer++;
			}
			else if(control instanceof Button)
			{
				typeButton = control.getName();
				countButton++;
			}
		}
		for(ConnectivityControl connectivityControl : mainboard.getConnectivities())
		{
			if(connectivityControl instanceof BluetoothHC06)
			{
				countBluetooth ++;
				typeBluetooth= connectivityControl.getName();
			}
			else if(connectivityControl instanceof WifiESP8266)
			{
				countWifi++;
				typeWifi = connectivityControl.getName();
			}
		}
		if(countBuzzer!=0)
			listControl +=  "<tr>\n"
					+ "<td>"+typeBuzzer+"</td>\n"
					+ "<td>"+countBuzzer+"</td>\n"
					+ "</tr>\n";
		if(countKeypad!=0)
			listControl +=  "<tr>\n"
					+ "<td>"+typeKeypad+"</td>\n"
					+ "<td>"+countKeypad+"</td>\n"
					+ "</tr>\n";
		if(countLCD!=0)
			listControl +=  "<tr>\n"
					+ "<td>"+typeLCD+"</td>\n"
					+ "<td>"+countLCD+"</td>\n"
					+ "</tr>\n";
		if(countLED!=0)
			listControl +=  "<tr>\n"
					+ "<td>"+typeLED+"</td>\n"
					+ "<td>"+countLED+"</td>\n"
					+ "</tr>\n";
		if(countWifi!=0)
			listControl +=  "<tr>\n"
					+ "<td>"+typeWifi+"</td>\n"
					+ "<td>"+countWifi+"</td>\n"
					+ "</tr>\n";
		if(countBluetooth!=0)
			listControl +=  "<tr>\n"
					+ "<td>"+typeBluetooth+"</td>\n"
					+ "<td>"+countBluetooth+"</td>\n"
					+ "</tr>\n";
		if(countButton!=0)
			listControl +=  "<tr>\n"
					+ "<td>"+typeButton+"</td>\n"
					+ "<td>"+countButton+"</td>\n"
					+ "</tr>\n";
		return listControl;
	}
}
