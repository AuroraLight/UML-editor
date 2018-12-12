package oop;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import buttons.UMLButtons;
import buttons.SelectButton;
import buttons.AssociationLineButton;
import buttons.GeneralizationLineButton;
import buttons.CompositionLineButton;
import buttons.ClassButton;
import buttons.UseCaseButton;


public class GUI {

	private JFrame frmUmlEditer;
	private	Container container;
	private GridBagLayout gridBagLayout;
	private ButtonGroup buttonGroup;
	private ArrayList<UMLButtons> buttons;
	private PanelArea panel;
	private JMenuItem mntmChangeObjectName, mntmGroup, mntmUngroup;
	
	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		init_Frame();
		container = frmUmlEditer.getContentPane();
		init_Menu();
		init_Layout();

		panel = new PanelArea();
		
		init_Button();
		
		container.add(panel, panel.getGridBagConstraints());
		
		mntmUngroup.setEnabled(false);
		mntmChangeObjectName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.changeObjectName();
			}	
		});
		
		mntmGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.group();
				mntmUngroup.setEnabled(true);
			}	
		});
		
		mntmUngroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.ungroup();
			}	
		});
	}
	
	private void init_Frame() {
		frmUmlEditer = new JFrame();
		frmUmlEditer.setResizable(true);
		frmUmlEditer.setTitle("UML editer");
		frmUmlEditer.setBounds(100, 100, 800, 600);
		frmUmlEditer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void init_Menu() {
		JMenuBar menuBar = new JMenuBar();
		frmUmlEditer.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		mntmGroup = new JMenuItem("Group");
		mnNewMenu_1.add(mntmGroup);
		
		mntmUngroup = new JMenuItem("Ungroup");
		mnNewMenu_1.add(mntmUngroup);
		
		mntmChangeObjectName = new JMenuItem("Change Object Name");
		mnNewMenu_1.add(mntmChangeObjectName);
	}
	
	private void init_Layout() {
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {200, 600};
		gridBagLayout.rowHeights = new int[] {100, 100, 100, 100, 100, 100};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		container.setLayout(gridBagLayout);
	}
	
	private void init_Button() {
		buttonGroup = new ButtonGroup();
		buttons = new ArrayList<UMLButtons>();
		buttons.add(new SelectButton());
		buttons.add(new AssociationLineButton());
		buttons.add(new GeneralizationLineButton());
		buttons.add(new CompositionLineButton());
		buttons.add(new UseCaseButton());
		buttons.add(new ClassButton());
		
		for(int i = 0; i < buttons.size(); i++) {
			buttons.get(i).setPanel(panel);
			container.add(buttons.get(i), buttons.get(i).getGridBagConstraints());
			buttonGroup.add(buttons.get(i));	
		}
		buttons.get(0).doClick();
	}
	
	public JFrame getfrmUmlEditer() {return this.frmUmlEditer;}
}