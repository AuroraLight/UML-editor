package buttons;

import java.awt.event.ActionEvent;
/*import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;*/

import javax.swing.ImageIcon;

import mods.SelectMod;


public class SelectButton extends UMLButtons{
	
/*	private Boolean onObject, moving;
	private int x1, y1, x2, y2, x3, y3;*/
	
	public SelectButton() {
		icon_path = "icon/select.jpg";
		this.setIcon(new ImageIcon(icon_path));
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		mod = new SelectMod();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		panel.setMod(mod);
		
/*		removeListeners();
		panel.addMouseListener(new MouseListener() {
			
			public void mouseClicked(MouseEvent arg0) {}

			public void mouseEntered(MouseEvent arg0) {}

			public void mouseExited(MouseEvent arg0) {}

			public void mousePressed(MouseEvent e) {
				x1 = e.getX();
				y1 = e.getY();
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

			public void mouseReleased(MouseEvent e) {
				x2 = e.getX();
				y2 = e.getY();
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
		});
		
		panel.addMouseMotionListener(new MouseMotionListener() {
			
			public void mouseDragged(MouseEvent e) {
				x3 = e.getX();
				y3 = e.getY();
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

			public void mouseMoved(MouseEvent arg0) {}			
		});*/
	}
}