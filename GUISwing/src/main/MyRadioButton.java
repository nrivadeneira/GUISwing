package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyRadioButton extends JFrame implements ActionListener{

	// JRadioButton = one or more buttons in a grouping in which 
	//                only 1 may be selected per group
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	ButtonGroup group;
	
	MyRadioButton(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		ImageIcon pizzaIcon = new ImageIcon("./src/pizza.PNG");
		ImageIcon hamburgerIcon = new ImageIcon("./src/hamburger.PNG");
		ImageIcon hotdogIcon = new ImageIcon("./src/hotdog.PNG");		
		
		pizzaButton = new JRadioButton("pizza");
		pizzaButton.setFocusable(false);
		pizzaButton.addActionListener(this);
		pizzaButton.setIcon(pizzaIcon);
		
		hamburgerButton = new JRadioButton("hamburger");
		hamburgerButton.setFocusable(false);
		hamburgerButton.addActionListener(this);
		hamburgerButton.setIcon(hamburgerIcon);
		
		hotdogButton = new JRadioButton("hotdog");
		hotdogButton.setFocusable(false);
		hotdogButton.addActionListener(this);
		hotdogButton.setIcon(hotdogIcon);
		
		group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==pizzaButton) {
			System.out.println("You ordered pizza!");
		} else if (e.getSource()==hamburgerButton) {
			System.out.println("You ordered hamburger!");
		} else if (e.getSource()==hotdogButton){
			System.out.println("You ordered hotdog!");
		}
		
	}
}
