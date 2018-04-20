package iotwearable.editor.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.XYLayout;
/**
 *Abstract class for all input - output control figure  
 */
public abstract class IOControlFigure extends Figure implements ControlFigure {
	public IOControlFigure() {
		setLayoutManager(new XYLayout());
	}
}