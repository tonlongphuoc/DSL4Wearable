package iotwearable.editor.keyhandler;

import iotwearable.editor.command.ConnectivityControlChangeContraintsCommand;
import iotwearable.model.iotw.ConnectivityControl;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;

public class ConnectivityControlMove extends MoveKeyHandler{

	@Override
	public void keyPressed(KeyEvent e, EditPart editPart,
			CommandStack commandStack) {
		if(e == null && editPart == null)
			return;
		switch (e.keyCode) {
		case SWT.ARROW_RIGHT:
			if(editPart.getModel() instanceof ConnectivityControl){
				ConnectivityControl control = (ConnectivityControl)editPart.getModel();
				Rectangle rectangle =  new Rectangle(control.getConstraints().x + 1,
						control.getConstraints().y, control.getConstraints().width,
						control.getConstraints().height);
				ConnectivityControlChangeContraintsCommand command = new ConnectivityControlChangeContraintsCommand();
				command.setNewConstraints(rectangle);
				command.setControl(control);
				commandStack.execute(command);
			}
			break;
		case SWT.ARROW_LEFT:
			if(editPart.getModel() instanceof ConnectivityControl){
				ConnectivityControl control = (ConnectivityControl)editPart.getModel();
				Rectangle rectangle =  new Rectangle(control.getConstraints().x - 1,
						control.getConstraints().y, control.getConstraints().width,
						control.getConstraints().height);
				ConnectivityControlChangeContraintsCommand command = new ConnectivityControlChangeContraintsCommand();
				command.setNewConstraints(rectangle);
				command.setControl(control);
				commandStack.execute(command);
			}
			break;
		case SWT.ARROW_UP:
			if(editPart.getModel() instanceof ConnectivityControl){
				ConnectivityControl control = (ConnectivityControl)editPart.getModel();
				Rectangle rectangle =  new Rectangle(control.getConstraints().x,
						control.getConstraints().y-1, control.getConstraints().width,
						control.getConstraints().height);
				ConnectivityControlChangeContraintsCommand command = new ConnectivityControlChangeContraintsCommand();
				command.setNewConstraints(rectangle);
				command.setControl(control);
				commandStack.execute(command);
			}
			break;
		case SWT.ARROW_DOWN:
			if(editPart.getModel() instanceof ConnectivityControl){
				ConnectivityControl control = (ConnectivityControl)editPart.getModel();
				Rectangle rectangle =  new Rectangle(control.getConstraints().x,
						control.getConstraints().y+1, control.getConstraints().width,
						control.getConstraints().height);
				ConnectivityControlChangeContraintsCommand command = new ConnectivityControlChangeContraintsCommand();
				command.setNewConstraints(rectangle);
				command.setControl(control);
				commandStack.execute(command);
			}
			break;
		default:
			break;
		}
	}
}