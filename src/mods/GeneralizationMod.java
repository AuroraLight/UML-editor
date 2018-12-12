package mods;

import java.awt.Point;

import objects.Generalization;

public class GeneralizationMod extends Mod {
	
	private Generalization gl;
	private Boolean isStart = false;

	@Override
	public void mousePressed(int x, int y) {
		gl = new Generalization();
		int x1 = x;
		int y1 = y;
		isStart = false;
		Point p = panel.getRightPosition(x1, y1);
		if(p.x != -1 && p.y != -1) {
			gl.setObjectID_1(panel.getObjectId());
			gl.setDirection_1(panel.getSituation());
			gl.setStartPoint(new Point(p.x, p.y));
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
			if(p.x != -1 && p.y != -1 && gl.getObjectID_1() != objectID) {
				gl.setObjectID_2(objectID);
				gl.setDirection_2(panel.getSituation());
				gl.setEndPoint(new Point(p.x, p.y));
				panel.addConnectionLine(gl);
				gl.setPortsPosition();
				panel.repaint();
			}
		}
	}
	
	@Override
	public void mouseDragged(int x, int y) {}
}
