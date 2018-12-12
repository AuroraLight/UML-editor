package objects;

import java.awt.Graphics2D;
import java.awt.Point;

public class Port {
	private Point position;
	//private Boolean isVisible;
	private int portSize;
	
	public Port() {
		//isVisible = false;
		portSize = 8;
	}
	
	public void setPosition(Point p) {position = p;}
	
	//public void setIsVissible(Boolean b) {isVisible = b;}
	
	public void draw(Graphics2D g) {g.fillRect(position.x, position.y, portSize, portSize);}
}
