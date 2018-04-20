package iotwearable.editor.figure;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

/**
 * Used to create StateFrame figure
 */
public class StateFrameFigure extends StateControlFigure{

	public static Color classColor = new Color(null,255,255,206);
	private ConnectionAnchor connectionAnchor;
	private RoundedRectangle frame;
	SmartLabelFigure name;
	SmartLabelFigure content;
	
	public StateFrameFigure() {
		super();
		frame = new RoundedRectangle();
		frame.setCornerDimensions(new Dimension(25, 25));
		
		ToolbarLayout layout = new ToolbarLayout();
		frame.setLayoutManager(layout);	
		frame.setBackgroundColor(classColor);
		frame.setOpaque(true);
	    name = new SmartLabelFigure(FigureConstants.TEXT_WIDTH_TO_HEIGHT_RATIO);
	    name.setForegroundColor(FigureConstants.LABEL_COLOR);
	    name.setText("Name");
	    content = new SmartLabelFigure(FigureConstants.TEXT_WIDTH_TO_HEIGHT_RATIO);
	    content.setBorder(new CompartmentFigureBorder());
	    content.setForegroundColor(FigureConstants.LABEL_COLOR);
	    content.setHorizontalAligment(PositionConstants.LEFT);
	    content.setText("Content");
	    frame.add(name);
	    frame.add(content);
	    add(frame);
	}
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle r =(Rectangle) getBounds().getCopy();
		setConstraint(frame, new Rectangle(0,0,r.width,r.height));
	}
	/**
	 * Calculates the position of the mouse cursor
	 * when clicked on the space of the sateframe.
	 * If in the Name space, return true otherwise return false.
	 * @param location Point
	 * @return boolean
	 */
	public boolean isAreaName(Point location){
		Point startPoint = this.name.getLocation();
		double maxX = startPoint.preciseX() + this.name.getSize().width;
		double maxY = startPoint.preciseY() + this.name.getSize().height;
		if(location.preciseX() <= maxX && location.preciseY() <= maxY
				&& location.preciseX() >= startPoint.preciseX() 
				&& location.preciseY() >= startPoint.preciseY()){
			return true;
		}
		return false;
	}
	/**
	 * Calculates the position of the mouse cursor
	 * when clicked on the space of the stateframe.
	 * If in the Content space, return true otherwise return false;
	 * @param location Point
	 * @return boolean
	 */
	public boolean isAreaContent(Point location){
		Point startPoint = this.content.getLocation();
		double maxX = startPoint.preciseX() + this.content.getSize().width;
		double maxY = startPoint.preciseY() + getSize().height;
		if(location.preciseX() <= maxX && location.preciseY() <= maxY
				&& location.preciseX() >= startPoint.preciseX() 
				&& location.preciseY() >= startPoint.preciseY()){
			return true;
		}
		return false;
	}
	
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor() {
		return getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor() {
		return getConnectionAnchor();
	}
	public SmartLabelFigure getName() {
		return name;
	}
	public void setName(SmartLabelFigure name) {
		this.name = name;
	}
	public SmartLabelFigure getContent() {
		return content;
	}
	public void setContent(SmartLabelFigure content) {
		this.content = content;
	}
	//A frame bottom in sateframe
	/**********************************
	 * --------------
	 * |			|
	 * --------------
	 * |////////////|
	 * |////////////|
	 * --------------
	 * ********************************/
	public class CompartmentFigureBorder extends AbstractBorder {
	    public Insets getInsets(IFigure figure) {
	      return new Insets(1,0,0,0);
	    }
	    public void paint(IFigure figure, Graphics graphics, Insets insets) {
	      graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(),
	                        tempRect.getTopRight());
	    }
	  }
}
