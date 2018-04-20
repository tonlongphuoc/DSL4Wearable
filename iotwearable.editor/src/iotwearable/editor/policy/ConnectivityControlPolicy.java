package iotwearable.editor.policy;

import iotwearable.editor.command.ConnectivityControlDeleteCommand;
import iotwearable.model.iotw.ConnectivityControl;
import iotwearable.model.iotw.Mainboard;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class ConnectivityControlPolicy extends ComponentEditPolicy{
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		ConnectivityControlDeleteCommand command = new ConnectivityControlDeleteCommand();
		command.setControl((ConnectivityControl) getHost().getModel());
		command.setMainboard((Mainboard)getHost().getParent().getModel());
		return command;
	}

}