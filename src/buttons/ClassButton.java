package buttons;

//import java.awt.Point;
import java.awt.event.ActionEvent;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;



import javax.swing.ImageIcon;

import mods.ClassMod;

//import objects.Class;


public class ClassButton  extends UMLButtons{
	
	//private Class cl;
	
	public ClassButton() {
		icon_path = "icon/class.jpg";
		this.setIcon(new ImageIcon(icon_path));
		gbc.gridx = 0;
		gbc.gridy = 4;
		
		mod = new ClassMod();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		panel.setMod(mod);
		
		/*removeListeners();
		panel.addMouseListener(new MouseListener() {
			
			public void mouseClicked(MouseEvent arg0) {}

			public void mouseEntered(MouseEvent arg0) {}

			public void mouseExited(MouseEvent arg0) {}

			public void mousePressed(MouseEvent e) {
				cl = new Class();
				int x = e.getX();
				int y = e.getY();
				cl.setPosition(new Point(x, y));
				panel.addUMLObject(cl);
				panel.setUMLObjectID();
				panel.repaint();
			}
			public void mouseReleased(MouseEvent arg0) {}
		});*/
	}
}