package iotwearable.editor.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;

public class TextCellEditorLocator implements CellEditorLocator{
	private IFigure lable;
	public TextCellEditorLocator(IFigure textFlow) {
		this.lable = textFlow;
	}
	
	@Override
	public void relocate(CellEditor celleditor) {
		Text text = (Text) celleditor.getControl();
	    Point pref = text.computeSize(lable.getSize().width, lable.getSize().height);
	    Rectangle rect = lable.getBounds().getCopy();
	    lable.translateToAbsolute(rect);
	    text.setBounds(rect.x - 1, rect.y - 1, pref.x + 1, pref.y + 1); 
	}
}
