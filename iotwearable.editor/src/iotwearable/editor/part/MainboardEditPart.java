package iotwearable.editor.part;

import java.util.ArrayList;
import java.util.List;

import iotwearable.editor.policy.MainboardXYLayoutEditorPolicy;
import iotwearable.model.iotw.ConnectivityControl;
import iotwearable.model.iotw.Control;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.Mainboard;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class MainboardEditPart extends AbstractGraphicalEditPart{
	
	private IOWearableAdapter adapter;

	public MainboardEditPart() {
		super();
		adapter = new IOWearableAdapter();
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
				new MainboardXYLayoutEditorPolicy());
	}

	@Override
	protected List<Control> getModelChildren() {
		Mainboard ioWearable = (Mainboard) getModel();
		List<Control> controls = new ArrayList<Control>();
		for(IOControl ioControl: ioWearable.getControls())
		{
			controls.add(ioControl);
		}
		for(ConnectivityControl connectivityControl : ioWearable.getConnectivities())
		{
			controls.add(connectivityControl);
		}
		return controls;
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((Mainboard) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((Mainboard) getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}

	// adapter
	public class IOWearableAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refreshChildren();
		}

		@Override
		public Notifier getTarget() {
			return (Mainboard) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(Mainboard.class);
		}
	}
}
