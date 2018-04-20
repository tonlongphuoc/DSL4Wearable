package iotwearable.editor.part;

import java.util.ArrayList;
import java.util.List;

import iotwearable.editor.policy.ConnectionBendpointEditPolicy;
import iotwearable.editor.policy.ConnectionDeleteEditPolicy;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.ConnectionKind;
import iotwearable.model.iotw.RouterKind;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

public class ConnectionEditPart extends AbstractConnectionEditPart {
	private ConnectionAdapter adapter;
	protected Label label;

	public ConnectionEditPart() {
		super();
		adapter = new ConnectionAdapter();
	}

	public Label getLabel() {
		return label;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new ConnectionDeleteEditPolicy());
		if(((Connection)getModel()).getRouterKind() == RouterKind.BENDPOINT) {
		    installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new ConnectionBendpointEditPolicy());
		}
	}

	@Override
	protected PolylineConnection createFigure() {
		PolylineConnection conn = new PolylineConnection();
		MidpointLocator labelLocator = new MidpointLocator(conn, 0);
		Connection connection = (Connection) getModel();
		label = new Label();
		label.setOpaque(true);
		conn.add(label, labelLocator);
		switch (connection.getRouterKind()) {
		case BENDPOINT:
			conn.setConnectionRouter(new BendpointConnectionRouter());
			break;
		case MANHATTAN:
			conn.setConnectionRouter(new ManhattanConnectionRouter());
			break;
		}
		decorateConnection(conn, connection.getKind());
		return conn;
	}

	@Override
	protected void refreshVisuals() {
		Connection flowControl = (Connection) getModel();
		switch (flowControl.getRouterKind()) {
		case BENDPOINT:
			org.eclipse.draw2d.Connection connectionFigure = getConnectionFigure();
			List<Point> modelConstraint = ((Connection) getModel())
					.getBendpoints();
			List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
			for (Point p : modelConstraint) {
				figureConstraint.add(new AbsoluteBendpoint(p));
			}
			connectionFigure.setRoutingConstraint(figureConstraint);
			label.setText(flowControl.getLabel());
			break;
		case MANHATTAN:
			break;
		}
	}

	/**
	 * Decorate a connection depending on its kind.
	 * 
	 * @param connection
	 *            the PolylineConnection to decorate.
	 * @param kind
	 *            the ConnecitonKind of the model entity.
	 */
	private void decorateConnection(PolylineConnection connection,
			ConnectionKind kind) {
		switch (kind) {
		case STATE_FLOW:
			connection.setTargetDecoration(new PolylineDecoration());
			break;
		default:
			throw new IllegalArgumentException("No case for kind " + kind);
		}
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((Connection) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((Connection) getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}

	/**
	 * Observer for changes in an Connection. Refreshes the ConnectionEditPart}
	 * visuals on every change to the model.
	 * 
	 * @reference vainolo
	 */
	public class ConnectionAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refreshVisuals();
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public Notifier getTarget() {
			return (Connection) getModel();
		}

		/**
		 * Does nothing.
		 */
		@Override
		public void setTarget(Notifier newTarget) {
			// Do nothing.
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(Connection.class);
		}
	}
}
