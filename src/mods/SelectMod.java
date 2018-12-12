package mods;

public class SelectMod extends Mod {
	
	private Boolean onObject, moving;
	private int x1, y1, x2, y2, x3, y3;

	public void mousePressed(int x, int y) {
		x1 = x;
		y1 = y;
		onObject = false;
		moving = false;
		panel.setIsSelectOnGroup(false);
		panel.setIsSelectOnObject(false);
		if(panel.isSelectOnObject(x1, y1)) {
			onObject = true;
			panel.storeOriginPosition();
		}
		panel.repaint();
	}
	
	@Override
	public void mouseReleased(int x, int y) {
		x2 = x;
		y2 = y;
		if(!onObject) {
			if(panel.isDraging()) {
				panel.setIsDraging(false);
				panel.setPerfectRect(x1, y1, x2, y2);
				panel.changeSelectAreaObject();
			}
			else
				panel.setAllObjectUnselected();
		}
		else {
			if(!panel.isSelectOnGroup()) {
				if(moving) {
					panel.setAllObjectUnselected();
					panel.setObjectIsSelected(true);
				}
				else
					panel.changeObjectIsSelected();
			}
			else {
				panel.setAllObjectUnselected();
				panel.setGroupIsSelected(true);
			}
		}
		panel.repaint();
	}
	
	@Override
	public void mouseDragged(int x, int y) {
		x3 = x;
		y3 = y;
		moving = true;
		panel.setAllObjectUnselected();
		if(onObject)
			panel.moveObject(x1, y1, x3, y3);
		else {
			panel.setIsDraging(true);
			panel.setPerfectRect(x1, y1, x3, y3);
		}
		panel.repaint();
	}
}
