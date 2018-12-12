package mods;

import java.awt.Point;

import objects.Class;

public class ClassMod extends Mod{
	
	private Class cl;

	@Override
	public void mousePressed(int x, int y) {
		cl = new Class();
		cl.setPosition(new Point(x, y), new Point(x, y));
		panel.addUMLObject(cl);
		panel.setUMLObjectID();
		panel.repaint();
	}
	
	@Override
	public void mouseReleased(int x, int y) {}
	
	@Override
	public void mouseDragged(int x, int y) {}
}
