package iotwearable.editor.command;

import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.gef.commands.Command;
/**
 * Command used to delete StateControl
 */
public class StateControlDeleteCommand extends Command{
	private StateControl stateControl;
	private StateSchema stateSchema;
	
	@Override
	public void undo() {
		stateSchema.getControls().add(stateControl);
	}
	
	@Override
	public void execute() {
		for(Connection conn : stateControl.getIncomings()){
			if(conn.getTarget().equals(stateControl)){
				conn.setTarget(null);
			}
		}
		for(Connection conn : stateControl.getOutgoings()){
			if(conn.getSource().equals(stateControl)){
				conn.setSource(null);
			}
		}
		stateSchema.getControls().remove(stateControl);
	}
	
	@Override
	public boolean canExecute() {
		return stateSchema != null && stateControl != null;
	}
	
	public void setStateControl(StateControl stateControl) {
		this.stateControl = stateControl;
	}
	public void setStateSchema(StateSchema stateSchema) {
		this.stateSchema = stateSchema;
	}
}
