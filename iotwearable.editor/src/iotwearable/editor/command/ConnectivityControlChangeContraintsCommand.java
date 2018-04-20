package iotwearable.editor.command;

import iotwearable.model.iotw.ConnectivityControl;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

public class ConnectivityControlChangeContraintsCommand extends Command {
	private Rectangle oldConstraints;
	private Rectangle newConstraints;
	private ConnectivityControl control;
	
	@Override
	public void undo() {
		control.setConstraints(oldConstraints);
	}
	
	@Override
	public void execute() {
		control.setConstraints(newConstraints);
	}
	
	@Override
	public boolean canExecute() {
		return control != null && newConstraints != null
				&& newConstraints.height == oldConstraints.height
				&& newConstraints.width == oldConstraints.width;
	}
	
	public void setNewConstraints(Rectangle newConstraints) {
		this.newConstraints = newConstraints;
	}
	
	public void setControl(ConnectivityControl control) {
		this.control = control;
		this.oldConstraints = control.getConstraints();
	}
}
