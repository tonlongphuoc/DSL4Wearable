package iotwearable.editor.command;


import java.util.ArrayList;
import java.util.List;

import iotwearable.model.iotw.ConnectivityControl;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.Pin;

import org.eclipse.gef.commands.Command;

/**
 * Command used to delete Connectivity Control.
 */
public class ConnectivityControlDeleteCommand extends Command{
	private ConnectivityControl control;
	private Mainboard mainboard;
	private List<Pin> listPinMainBoard;
	
	public void setControl(ConnectivityControl control) {
		this.control = control;
	}
	public void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}
	@Override
	public void undo() {
		for(Pin pin : listPinMainBoard){
			Pin _pin = new Pin(pin.getName(), pin.getType());
			_pin.setIdConnect(pin.getIdConnect());
			mainboard.modifyPin(_pin);
		}
		mainboard.addConnectivity(control);
	}
	@Override
	public void execute() {
		listPinMainBoard = new ArrayList<Pin>();
		for(Pin pin : control.getPinConnecteds()){
			for(Pin _pin : mainboard.getPinConnecteds()){
				if(pin.getIdConnect().equals(_pin.getIdConnect())){
					Pin newPin = new Pin(_pin.getName(), _pin.getType());
					newPin.setIdConnect(_pin.getIdConnect());
					listPinMainBoard.add(newPin);
					break;
				}
			}
		}
		mainboard.removeConnectivity(control);
	}
}
