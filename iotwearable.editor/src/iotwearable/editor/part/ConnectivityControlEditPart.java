package iotwearable.editor.part;

import iotwearable.editor.figure.ConnectivityControlFigure;
import iotwearable.editor.policy.ConnectivityControlPolicy;
import iotwearable.editor.policy.MainboardXYLayoutEditorPolicy;
import iotwearable.model.iotw.ConnectivityControl;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;

public abstract class ConnectivityControlEditPart extends ControlEditPart {
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new MainboardXYLayoutEditorPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ConnectivityControlPolicy());
	}

	@Override
	protected void refreshVisuals() {
		ConnectivityControlFigure figure = (ConnectivityControlFigure) getFigure();
		ConnectivityControl model = (ConnectivityControl) getModel();
		GraphicalEditPart parent = (GraphicalEditPart) getParent();
		parent.setLayoutConstraint(this, figure, model.getConstraints());
	}

}
