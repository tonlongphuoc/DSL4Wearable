package iotwearable.editor.figure;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

/**
 * Used to create Buzzer figure
 */
public class BuzzerFigure extends OutputControlFigure{
	private ImageFigure figure;
	private Image image;

	public BuzzerFigure() {
		super();
		image = new Image(null, this.getClass().getResourceAsStream("buzzer.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}

	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle r = getBounds().getCopy();
		setConstraint(figure, new Rectangle(0, 0, r.width, r.height));
	}
}
