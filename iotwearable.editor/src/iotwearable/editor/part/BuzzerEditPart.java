package iotwearable.editor.part;

import iotwearable.editor.figure.BuzzerFigure;

import org.eclipse.draw2d.IFigure;

public class BuzzerEditPart extends IOControlEditPart {

	@Override
	protected IFigure createFigure() {
		return new BuzzerFigure();
	}
}
