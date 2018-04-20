package iotwearable.editor.policy;

import iotwearable.editor.command.IOControlDeleteCommand;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.Mainboard;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class IOControlPolicy extends ComponentEditPolicy{
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		IOControlDeleteCommand command = new IOControlDeleteCommand();
		command.setControl((IOControl) getHost().getModel());
		command.setMainboard((Mainboard)getHost().getParent().getModel());
		return command;
	}
}
