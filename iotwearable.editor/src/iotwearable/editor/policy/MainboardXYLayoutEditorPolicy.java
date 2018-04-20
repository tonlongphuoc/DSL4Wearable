package iotwearable.editor.policy;

import iotwearable.editor.command.ConnectivityControlChangeContraintsCommand;
import iotwearable.editor.command.ConnectivityControlCreateCommand;
import iotwearable.editor.command.IOControlChangeConstraintsCommand;
import iotwearable.editor.command.IOControlCreateCommand;
import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.Buzzer;
import iotwearable.model.iotw.ConnectivityControl;
import iotwearable.model.iotw.I2CLCD2004;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.LED;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.WifiESP8266;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

public class MainboardXYLayoutEditorPolicy extends XYLayoutEditPolicy{

	private static Dimension DEFAULT_DIMENSION;

	@Override
	protected Command createChangeConstraintCommand(
			ChangeBoundsRequest request, EditPart child, Object constraint) {
		if(child.getModel() instanceof IOControl)
		{
			IOControlChangeConstraintsCommand command = new IOControlChangeConstraintsCommand();
			command.setControl((IOControl) child.getModel());
			command.setNewConstraints((Rectangle) constraint);
			return command;
		}
		else 
		{
			ConnectivityControlChangeContraintsCommand command = new ConnectivityControlChangeContraintsCommand();
			command.setControl((ConnectivityControl) child.getModel());
			command.setNewConstraints((Rectangle)constraint);
			return command;
		}

	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		Command command = null;
		boolean isIOTypeAllowed = false;
		boolean isConnectivityTypeAllowed = false;
		if (request.getNewObjectType().equals(Keypad4x4.class)){
			DEFAULT_DIMENSION = new Dimension(100, 100);
			isIOTypeAllowed = true;
		}
		else if(request.getNewObjectType().equals(Buzzer.class)){
			DEFAULT_DIMENSION = new Dimension(80, 80);
			isIOTypeAllowed = true;
		}
		else if(request.getNewObjectType().equals(LED.class)){
			DEFAULT_DIMENSION = new Dimension(50, 50);
			isIOTypeAllowed = true;
		}
		else if(request.getNewObjectType().equals(I2CLCD2004.class)){
			DEFAULT_DIMENSION = new Dimension(197, 98);
			isIOTypeAllowed = true;
		}
		else if(request.getNewObjectType().equals(Button.class)){
			DEFAULT_DIMENSION = new Dimension(50, 50);
			isIOTypeAllowed = true;
		}
		else if(request.getNewObjectType().equals(BluetoothHC06.class)){
			DEFAULT_DIMENSION = new Dimension(50, 50);
			isConnectivityTypeAllowed = true;
		}
		else if(request.getNewObjectType().equals(WifiESP8266.class)){
			DEFAULT_DIMENSION = new Dimension(50, 50);
			isConnectivityTypeAllowed = true;
		}
		if(isConnectivityTypeAllowed)
		{
			ConnectivityControlCreateCommand createCommand = new ConnectivityControlCreateCommand();
			Point clickLocation = request.getLocation();
			((GraphicalEditPart) getHost()).getFigure().translateFromParent(clickLocation);
			createCommand.setControl((ConnectivityControl) (request.getNewObject()));
			createCommand.setConstraints(new Rectangle(clickLocation, DEFAULT_DIMENSION));
			try {
				createCommand.setMainboard((Mainboard) getHost().getModel());
			} catch (ClassCastException c) {
			}
			command = createCommand;
		}
		else if(isIOTypeAllowed){
			IOControlCreateCommand createCommand = new IOControlCreateCommand();
			Point clickLocation = request.getLocation();
			((GraphicalEditPart) getHost()).getFigure().translateFromParent(clickLocation);
			createCommand.setControl((IOControl) (request.getNewObject()));
			createCommand.setConstraints(new Rectangle(clickLocation, DEFAULT_DIMENSION));
			try {
				createCommand.setMainboard((Mainboard) getHost().getModel());
			} catch (ClassCastException c) {
			}
			command = createCommand;
		}
		return command;
	}
}
