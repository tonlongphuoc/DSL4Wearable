package iotwearable.editor.part;

import iotwearable.editor.figure.MultiLineTextCellEditor;
import iotwearable.editor.figure.SmartLabelFigure;
import iotwearable.editor.figure.StateFrameFigure;
import iotwearable.editor.policy.StateFrameDirectEditPolicy;
import iotwearable.model.iotw.StateFrame;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.requests.DirectEditRequest;

public class StateFrameEditPart extends StateControlEditPart{
	private String propertiesDirect = "";
	@Override
	protected IFigure createFigure() {
		return new StateFrameFigure();
	}
	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new StateFrameDirectEditPolicy());
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		StateFrameFigure figure = (StateFrameFigure)getFigure();
		StateFrame frame = (StateFrame)getModel();
		figure.getName().setText(frame.getName());
		figure.getContent().setText(frame.getContent());
	}
	
	@Override
	public void performRequest(Request req) {
		if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			if (req instanceof DirectEditRequest) {
				this.propertiesDirect = "";
				Point p = ((DirectEditRequest) req).getLocation();
				StateFrameFigure figure = (StateFrameFigure) getFigure();
				if (figure.isAreaName(p)) {
					performNameDirectEditing();
				} else if (figure.isAreaContent(p)) {
					performContentDirectEditing();
				}
			}
		}
	}

	private void performNameDirectEditing() {
		this.propertiesDirect = "name";
		SmartLabelFigure label = ((StateFrameFigure) getFigure()).getName();
		StateFrameDirectEditManager manager = new StateFrameDirectEditManager(this,
				MultiLineTextCellEditor.class, new TextCellEditorLocator(label), label);
		manager.show();
	}

	private void performContentDirectEditing() {
		this.propertiesDirect = "content";
		SmartLabelFigure label = ((StateFrameFigure) getFigure()).getContent();
		StateFrameDirectEditManager manager = new StateFrameDirectEditManager(this,
				MultiLineTextCellEditor.class, new TextCellEditorLocator(label), label);
		manager.show();
	}

	public String getPropertiesDirect() {
		return propertiesDirect;
	}
}
