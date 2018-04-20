package iotwearable.editor.figure;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.XYLayout;
/**
 *Abstract class for all sate controls figure 
 */
public abstract class StateControlFigure extends Figure implements ControlFigure{

	public StateControlFigure() {
		setLayoutManager(new XYLayout());
	}
    public abstract ConnectionAnchor getSourceConnectionAnchor();
    
    public abstract ConnectionAnchor getTargetConnectionAnchor();
}
