package mods;

import java.awt.Point;

import objects.Composition;

public class CompositionMod extends Mod {
	
	private Composition cl;
	private Boolean isStart = false;

	@Override
	public void mousePressed(int x, int y) {
		cl = new Composition();
		int x1 = x;
		int y1 = y;
		isStart = false;
		Point p = panel.getRightPosition(x1, y1);
		if(p.x != -1 && p.y != -1) {
			cl.setObjectID_1(panel.getObjectId());
			cl.setDirection_1(panel.getSituation());
			cl.setStartPoint(new Point(p.x, p.y));
			isStart = true;
		}
	}
	
	@Override
	public void mouseReleased(int x, int y) {
		int x2 = x;
		int y2 = y;
		if(isStart) {
			Point p = panel.getRightPosition(x2, y2);
			int objectID = panel.getObjectId();
			if(p.x != -1 && p.y != -1 && cl.getObjectID_1() != objectID) {
				cl.setObjectID_2(objectID);
				cl.setDirection_2(panel.getSituation());
				cl.setEndPoint(new Point(p.x, p.y));
				panel.addConnectionLine(cl);
				cl.setPortsPosition();
				panel.repaint();
			}
		}
	}
	
	@Override
	public void mouseDragged(int x, int y) {}
}
