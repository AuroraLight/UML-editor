package objects;

import java.awt.Graphics2D;
import java.awt.Point;


public class Association extends ConnectionLine {
	
	public Association() {
	}
	 
	@Override
	public void draw(Graphics2D g) {
		g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
	}
}