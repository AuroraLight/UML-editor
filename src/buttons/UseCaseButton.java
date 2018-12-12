package buttons;

//import java.awt.Point;
import java.awt.event.ActionEvent;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

import mods.UsecaseMod;
//import objects.Usecase;


public class UseCaseButton extends UMLButtons{
	
	//private Usecase uc;
	
	public UseCaseButton() {
		icon_path = "icon/use case.jpg";
		this.setIcon(new ImageIcon(icon_path));
		gbc.gridx = 0;
		gbc.gridy = 5;
		
		mod = new UsecaseMod();
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
				uc = new Usecase();
				int x = e.getX();
				int y = e.getY();
				uc.setPosition(new Point(x, y));
				panel.addUMLObject(uc);
				panel.setUMLObjectID();
				panel.repaint();
			}

			public void mouseReleased(MouseEvent arg0) {}
		});*/
	}
}