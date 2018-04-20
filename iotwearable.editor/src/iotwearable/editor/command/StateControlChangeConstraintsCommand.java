package iotwearable.editor.command;

import iotwearable.model.iotw.StateControl;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
/**
 * Command used to change constraints of StateControl.
 */
public class StateControlChangeConstraintsCommand extends Command{
	private Rectangle oldConstraints;
	private Rectangle newConstraints;
	private StateControl stateControl;
	
	@Override
	public void undo() {
		stateControl.setConstraints(oldConstraints);
	}
	
	@Override
	public void execute() {
		stateControl.setConstraints(newConstraints);
	}
	
	@Override
	public boolean canExecute() {
		return stateControl != null && newConstraints != null;
	}
	
	public void setNewConstraints(Rectangle newConstraints) {
		this.newConstraints = newConstraints;
	}
	public void setStateControl(StateControl stateControl) {
		this.stateControl = stateControl;
	}
}
