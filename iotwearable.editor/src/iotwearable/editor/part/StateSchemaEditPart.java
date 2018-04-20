package iotwearable.editor.part;

import java.util.ArrayList;
import java.util.List;

import iotwearable.editor.policy.StateSchemaXYLayoutEditorPolicy;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class StateSchemaEditPart extends AbstractGraphicalEditPart{

	private StateWearableAdapter adapter;

	public StateSchemaEditPart() {
		super();
		adapter = new StateWearableAdapter();
	}

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setLayoutManager(new FreeformLayout());
		layer.setBorder(new LineBorder(1));
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new StateSchemaXYLayoutEditorPolicy());
	}

	@Override
	protected List<StateControl> getModelChildren() {
		StateSchema schema = (StateSchema) getModel();
		List<StateControl> stateMachines = new ArrayList<StateControl>(schema.getControls());
		return stateMachines;
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((StateSchema) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((StateSchema) getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}
	
	// adapter
		public class StateWearableAdapter implements Adapter {

			@Override
			public void notifyChanged(Notification notification) {
				refreshChildren();
			}

			@Override
			public Notifier getTarget() {
				return (StateSchema) getModel();
			}

			@Override
			public void setTarget(Notifier newTarget) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isAdapterForType(Object type) {
				return type.equals(StateSchema.class);
			}
		}
}
