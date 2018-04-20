package iotwearable.editor.figure;


import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

/**
 * Used to create Keypad figure
 */
public class Keypad4x4Figure extends InputControlFigure{
	private ImageFigure figure;
	private Image image;

	public Keypad4x4Figure() {
		super();
		image = new Image(null, this.getClass().getResourceAsStream("keypad4x4.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}

	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle r = getBounds().getCopy();
		setConstraint(figure, new Rectangle(0, 0, r.width, r.height));
	}
}
