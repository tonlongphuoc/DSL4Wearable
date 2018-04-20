package iotwearable.editor.part;

import iotwearable.editor.figure.DecisionFigure;

import org.eclipse.draw2d.IFigure;

public class DecisionEditPart extends StateControlEditPart{

	@Override
	protected IFigure createFigure() {
		return new DecisionFigure();
	}
}
