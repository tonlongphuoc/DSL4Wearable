package iotwearable.editor.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.XYLayout;

public class ConnectivityControlFigure extends Figure implements ControlFigure{
	public ConnectivityControlFigure() {
		setLayoutManager(new XYLayout());
	}
}
