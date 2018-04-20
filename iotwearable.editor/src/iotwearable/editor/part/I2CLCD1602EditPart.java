package iotwearable.editor.part;

import iotwearable.editor.figure.I2CLCD2004Figure;

import org.eclipse.draw2d.IFigure;

public class I2CLCD1602EditPart extends IOControlEditPart{

	@Override
	protected IFigure createFigure() {
		return new I2CLCD2004Figure();
	}
}
