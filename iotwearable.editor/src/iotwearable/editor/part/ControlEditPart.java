package iotwearable.editor.part;

import iotwearable.model.iotw.Control;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public abstract class ControlEditPart extends AbstractGraphicalEditPart{

	protected IoTWControlAdapter adapter;

	public ControlEditPart() {
		super();
		adapter = new IoTWControlAdapter();
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((Control) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((Control) getModel()).eAdapters().remove(adapter);
		}

		super.deactivate();
	}

	// adapter
	public class IoTWControlAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refresh();
		}

		@Override
		public Notifier getTarget() {
			return (Control) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(Control.class);
		}
	}
}
