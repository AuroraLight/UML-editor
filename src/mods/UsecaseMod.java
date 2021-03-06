package mods;

import java.awt.Point;

import objects.Usecase;

public class UsecaseMod extends Mod {

	private Usecase uc;
	
	public void mousePressed(int x, int y) {
		uc = new Usecase();
		uc.setPosition(new Point(x, y), new Point(x, y));
		panel.addUMLObject(uc);
		panel.setUMLObjectID();
		panel.repaint();
	}
	
	@Override
	public void mouseReleased(int x, int y) {}
	
	@Override
	public void mouseDragged(int x, int y) {}
}
