package iotwearable.editor.figure;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;
/**
 * Used to create 2CLCD1602 figure
 */
public class I2CLCD2004Figure extends OutputControlFigure{
	private ImageFigure figure;
	private Image image;
	
	public I2CLCD2004Figure() {
		super();
		image = new Image(null, this.getClass().getResourceAsStream("i2cLCD1_ESP_LAB.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle r = getBounds().getCopy();
		setConstraint(figure, new Rectangle(0, 0, r.width, r.height));
	}
}
