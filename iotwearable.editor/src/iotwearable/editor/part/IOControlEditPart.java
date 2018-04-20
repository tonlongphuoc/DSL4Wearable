package iotwearable.editor.part;

import iotwearable.editor.figure.IOControlFigure;
import iotwearable.editor.policy.IOControlPolicy;
import iotwearable.editor.policy.MainboardXYLayoutEditorPolicy;
import iotwearable.model.iotw.IOControl;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;

public abstract class IOControlEditPart extends ControlEditPart{
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new MainboardXYLayoutEditorPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new IOControlPolicy());
	}

	@Override
	protected void refreshVisuals() {
		IOControlFigure figure = (IOControlFigure) getFigure();
		IOControl model = (IOControl) getModel();
		GraphicalEditPart parent = (GraphicalEditPart) getParent();
		parent.setLayoutConstraint(this, figure, model.getConstraints());
	}
}