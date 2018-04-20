package iotwearable.editor.command;

import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
/**
 * Command used to create new StateControl
 */
public class StateControlCreateCommand extends Command{
	private StateControl control;
	private StateSchema schema;
	private Rectangle constraints;
	
	@Override
	public boolean canExecute() {
		return control != null && schema != null && constraints != null;
	}
	@Override
	public void execute() {
		control.setConstraints(constraints);
		schema.getControls().add(control);
	}
	@Override
	public void undo() {
		schema.getControls().remove(control);
	}
	public void setControl(StateControl control) {
		this.control = control;
	}
	public void setSchema(StateSchema schema) {
		this.schema = schema;
	}
	public void setConstraints(Rectangle constraints) {
		this.constraints = constraints;
	}
}
