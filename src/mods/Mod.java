package mods;

import oop.PanelArea;

public abstract class Mod {

	protected PanelArea panel;
	
	public void setPanel(PanelArea panel) {this.panel = panel;}

	public abstract void mousePressed(int x, int y);
	public abstract void mouseReleased(int x, int y);
	
	public abstract void mouseDragged(int x, int y);
	
}