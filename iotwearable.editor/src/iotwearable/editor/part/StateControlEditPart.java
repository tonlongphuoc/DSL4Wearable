package iotwearable.editor.part;

import java.util.List;

import iotwearable.editor.figure.StateControlFigure;
import iotwearable.editor.policy.StateControlGraphicalNodeEditPolicy;
import iotwearable.editor.policy.StateControlPolicy;
import iotwearable.editor.policy.StateSchemaXYLayoutEditorPolicy;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.StateControl;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;

public abstract class StateControlEditPart extends ControlEditPart implements NodeEditPart{
	 
	public StateControlEditPart() {
		super();
	}
	
	@Override
	    protected List<Connection> getModelSourceConnections() {
		 StateControl model = (StateControl)getModel();
	    	return model.getOutgoings();
	    }

	    @Override
	    protected List<Connection> getModelTargetConnections() {
	    	StateControl model = (StateControl)getModel();
	    	return model.getIncomings();
	    }
	    /**
	     * Install edit policies that can be applied to {@link OPMNodeEditPart} instances.
	     */
	    @Override
		protected void createEditPolicies() {
			installEditPolicy(EditPolicy.COMPONENT_ROLE, new StateControlPolicy());
	        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new StateControlGraphicalNodeEditPolicy());
	        installEditPolicy(EditPolicy.LAYOUT_ROLE, new StateSchemaXYLayoutEditorPolicy());
		}
	    
	    @Override
		protected void refreshVisuals() {
			StateControlFigure figure = (StateControlFigure) getFigure();
			StateControl model = (StateControl) getModel();
			GraphicalEditPart parent = (GraphicalEditPart) getParent();
			parent.setLayoutConstraint(this, figure, model.getConstraints());
		}
	    
	    @Override
	    public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
	    	return ((StateControlFigure)getFigure()).getSourceConnectionAnchor();
	    }

	    @Override
	    public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
	    	return ((StateControlFigure)getFigure()).getTargetConnectionAnchor();
	    }

	    @Override
	    public ConnectionAnchor getSourceConnectionAnchor(Request request) {
	    	return ((StateControlFigure)getFigure()).getSourceConnectionAnchor();
	    }

	    @Override
	    public ConnectionAnchor getTargetConnectionAnchor(Request request) {
	    	return ((StateControlFigure)getFigure()).getTargetConnectionAnchor();
	    }
	
	
}
