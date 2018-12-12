package buttons;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;*/

import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

import mods.Mod;
import oop.PanelArea;


public abstract class UMLButtons extends JToggleButton implements ActionListener{
	
	protected String icon_path;
	protected GridBagConstraints gbc;
	protected PanelArea panel;
	protected Mod mod;
	
	public UMLButtons() {
		this.addActionListener(this);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 0, 0, 5);
	}
	
	public Mod getMod() {return mod;}
	
	public GridBagConstraints getGridBagConstraints() {return gbc;}
	
	public void setPanel(PanelArea panel) {
		this.panel = panel;
		mod.setPanel(panel);
	}
	
/*	public void removeListeners() {
		MouseListener[] ml = panel.getMouseListeners();
		MouseMotionListener[] mml = panel.getMouseMotionListeners();
		if(ml != null)
			for (int i = 0; i < ml.length; i++)
				panel.removeMouseListener(ml[i]);
		if(mml != null)
			for (int i = 0; i < mml.length; i++)
				panel.removeMouseMotionListener(mml[i]);
	}*/
	
	public abstract void actionPerformed(ActionEvent arg0);
}