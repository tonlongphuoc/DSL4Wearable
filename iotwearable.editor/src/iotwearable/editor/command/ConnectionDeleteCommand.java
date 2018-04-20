package iotwearable.editor.command;

import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.Control;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.gef.commands.Command;
/**
 * Command used to delete connection.
 */
public class ConnectionDeleteCommand extends Command{
	private Connection connection;
	private StateSchema schema;
	private Control source;
	private Control target;
	
	@Override
	public void undo() {
		connection.setSource(source);
		((StateControl)source).getOutgoings().add(connection);
		connection.setTarget(target);
		((StateControl)target).getIncomings().add(connection);
		connection.setStateSchema(schema);
	}
	
	@Override
	public void execute() {
		source = connection.getSource();
		target = connection.getTarget();
		schema = connection.getStateSchema();
		if(source != null){
			((StateControl)source).getOutgoings().remove(connection);
		}
		connection.setSource(null);
		if(target != null){
			((StateControl)target).getIncomings().remove(connection);
		}
		connection.setTarget(null);
		connection.setStateSchema(null);
	}
	
	@Override
	public boolean canExecute() {
		return connection != null;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
