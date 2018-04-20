package iotwearable.editor.command;

import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.Control;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateSchema;
import iotwearable.validation.StateControlConnectionValidator;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

/**
 * Command used to create a new connection.
 */
public class ConnectionCreateCommand extends Command {
	private Control source;
	private Control target;
	private Connection connection;
	private StateSchema schema;

	@Override
	public void undo() {
		((StateControl) source).getOutgoings().remove(connection);
		connection.setSource(null);
		((StateControl) target).getIncomings().remove(connection);
		connection.setTarget(null);
		connection.setStateSchema(null);
	}

	@Override
	public void execute() {
		connection.setSource(source);
		((StateControl) source).getOutgoings().add(connection);
		connection.setTarget(target);
		((StateControl) target).getIncomings().add(connection);
		connection.setStateSchema(schema);
		// Object connect to itself
		if (connection.getSource().equals(connection.getTarget())) {
			Rectangle r = ((StateControl) source).getConstraints();
			Point p1 = new Point(r.x + r.width + 10, r.y + r.height / 3);
			Point p2 = new Point(r.x + r.width + 10, r.y + r.height / 2);
			connection.getBendpoints().add(p1);
			connection.getBendpoints().add(p2);
		}
	}

	@Override
	public boolean canExecute() {
		StateControlConnectionValidator validator = new StateControlConnectionValidator(source, target);
		return source != null && target != null && connection != null
				&& schema != null && validator.isValid();
	}

	public void setSource(Control source) {
		this.source = source;
	}

	public void setTarget(Control target) {
		this.target = target;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void setStateSchema(StateSchema stateSchema) {
		this.schema = stateSchema;
	}
}
