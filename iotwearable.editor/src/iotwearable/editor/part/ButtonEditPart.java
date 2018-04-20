package iotwearable.editor.part;

import iotwearable.editor.figure.ButtonFigure;

import org.eclipse.draw2d.IFigure;

public class ButtonEditPart extends IOControlEditPart{
	@Override
	protected IFigure createFigure() {
		return new ButtonFigure();
	}
}
