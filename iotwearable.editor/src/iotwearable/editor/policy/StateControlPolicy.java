package iotwearable.editor.policy;

import iotwearable.editor.command.StateControlDeleteCommand;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class StateControlPolicy extends ComponentEditPolicy{
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		StateControlDeleteCommand command = new StateControlDeleteCommand();
		command.setStateControl((StateControl)getHost().getModel());
		command.setStateSchema((StateSchema)getHost().getParent().getModel());
		return command;
	}
}
