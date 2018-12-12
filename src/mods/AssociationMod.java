package mods;

import java.awt.Point;

import objects.Association;

public class AssociationMod extends Mod {
	
	private Association al;
	private Boolean isStart = false;

	public void mousePressed(int x, int y) {
		al = new Association();
		int x1 = x;
		int y1 = y;
		isStart = false;
		Point p = panel.getRightPosition(x1, y1);
		if(p.x != -1 && p.y != -1) {
			al.setObjectID_1(panel.getObjectId());
			al.setDirection_1(panel.getSituation());
			al.setStartPoint(new Point(p.x, p.y));
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
			if(p.x != -1 && p.y != -1 && al.getObjectID_1() != objectID) {
				al.setObjectID_2(objectID);
				al.setDirection_2(panel.getSituation());
				al.setEndPoint(new Point(p.x, p.y));
				panel.addConnectionLine(al);
				al.setPortsPosition();
				panel.repaint();
			}
		}
	}
	
	@Override
	public void mouseDragged(int x, int y) {}
}
