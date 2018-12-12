package buttons;

//import java.awt.Point;
import java.awt.event.ActionEvent;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;


import javax.swing.ImageIcon;

import mods.CompositionMod;

//import objects.Composition;


public class CompositionLineButton extends UMLButtons{
	
	//private Composition cl;
	
	public CompositionLineButton() {
		icon_path = "icon/composition line.jpg";
		this.setIcon(new ImageIcon(icon_path));
		gbc.gridx = 0;
		gbc.gridy = 3;
		
		mod = new CompositionMod();
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
				cl = new Composition();
				int x1 = e.getX();
				int y1 = e.getY();
				isStart = false;
				Point p = panel.getRightPosition(x1, y1);
				if(p.x != -1 && p.y != -1) {
					cl.setObjectID_1(panel.getObjectId());
					cl.setDirection_1(panel.getSituation());
					cl.setStartPoint(new Point(p.x, p.y));
					isStart = true;
				}
			}

			public void mouseReleased(MouseEvent e) {
				int x2 = e.getX();
				int y2 = e.getY();
				if(isStart) {
					Point p = panel.getRightPosition(x2, y2);
					int objectID = panel.getObjectId();
					if(p.x != -1 && p.y != -1 && cl.getObjectID_1() != objectID) {
						cl.setObjectID_2(objectID);
						cl.setDirection_2(panel.getSituation());
						cl.setEndPoint(new Point(p.x, p.y));
						panel.addConnectionLine(cl);
						panel.repaint();
					}
				}
			}	
		});*/
	}	
}