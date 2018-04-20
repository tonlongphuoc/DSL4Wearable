package iotwearable.editor.figure;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Used to create StartPoint figure
 */
public class StartPointFigure extends StateControlFigure{
	private ConnectionAnchor connectionAnchor;
	private Ellipse ellipse;
	
	public StartPointFigure() {
		super();
	    ellipse = new Ellipse();
	    add(ellipse);
	}
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle r = (Rectangle)getBounds().getCopy();
		setConstraint(ellipse, new Rectangle(0,0,r.width,r.height));
	}
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new EllipseAnchor(this);
		}
		return connectionAnchor;
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor() {
		return getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor() {
		return getConnectionAnchor();
	}
}
