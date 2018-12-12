package buttons;

//import java.awt.Point;
import java.awt.event.ActionEvent;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;


import javax.swing.ImageIcon;

import mods.AssociationMod;

//import objects.Association;


public class AssociationLineButton extends UMLButtons{

	//private Association al;
	
	public AssociationLineButton() {
		icon_path = "icon/association line.jpg";
		this.setIcon(new ImageIcon(icon_path));
		gbc.gridx = 0;
		gbc.gridy = 1;
		
		mod = new AssociationMod();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		panel.setMod(mod);
		
		/*removeListeners();
		panel.addMouseListener(new MouseListener() {
			
			private Boolean isStart = false;
			
			public void mouseClicked(MouseEvent arg0) {}

			public void mouseEntered(MouseEvent arg0) {}

			public void mouseExited(MouseEvent arg0) {}

			public void mousePressed(MouseEvent e) {
				al = new Association();
				int x1 = e.getX();
				int y1 = e.getY();
				isStart = false;
				Point p = panel.getRightPosition(x1, y1);
				if(p.x != -1 && p.y != -1) {
					al.setObjectID_1(panel.getObjectId());
					al.setDirection_1(panel.getSituation());
					al.setStartPoint(new Point(p.x, p.y));
					isStart = true;
				}
			}

			public void mouseReleased(MouseEvent e) {
				int x2 = e.getX();
				int y2 = e.getY();
				if(isStart) {
					Point p = panel.getRightPosition(x2, y2);
					int objectID = panel.getObjectId();
					if(p.x != -1 && p.y != -1 && al.getObjectID_1() != objectID) {
						al.setObjectID_2(objectID);
						al.setDirection_2(panel.getSituation());
						al.setEndPoint(new Point(p.x, p.y));
						panel.addConnectionLine(al);
						panel.repaint();
					}
				}
			}
		});*/
	}
}