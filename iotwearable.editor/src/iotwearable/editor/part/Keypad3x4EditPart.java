package iotwearable.editor.part;

import iotwearable.editor.figure.Keypad4x4Figure;

import org.eclipse.draw2d.IFigure;

public class Keypad3x4EditPart extends IOControlEditPart{

	@Override
	protected IFigure createFigure() {
		return new Keypad4x4Figure();
	}
}