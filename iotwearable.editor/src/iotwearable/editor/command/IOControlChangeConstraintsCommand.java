package iotwearable.editor.command;

import iotwearable.model.iotw.IOControl;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
/**
 * Command used to change constraints of IOControl.
 */
public class IOControlChangeConstraintsCommand extends Command{
	private Rectangle oldConstraints;
	private Rectangle newConstraints;
	private IOControl control;
	
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
	
	public void setControl(IOControl control) {
		this.control = control;
		this.oldConstraints = control.getConstraints();
	}
}
