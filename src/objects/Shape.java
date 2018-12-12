package objects;

import java.awt.Graphics2D;
import java.awt.Point;

public abstract class Shape {
	
	public abstract void setOriginPosition(Point p);
	public abstract Point getOriginPostion();
	public abstract void setAllThingSelected();
	public abstract void setIsSelected(Boolean b);
	public abstract void setPosition(Point p, Point bias);
	public abstract Point getPosition();
	public abstract Point getSize();
	public abstract void setIsInGroup(Boolean b);
	public abstract void draw(Graphics2D g);
}
