package iotwearable.editor.part;

import iotwearable.editor.figure.EndPointFigure;

import org.eclipse.draw2d.IFigure;

public class EndPointEditPart extends StateControlEditPart{

	@Override
	protected IFigure createFigure() {
		return new EndPointFigure();
	}
}
