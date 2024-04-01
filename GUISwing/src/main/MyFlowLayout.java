package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFlowLayout extends JFrame {

	MyFlowLayout(){
		// Layout Manager = Defines the natural layout for components within a container
		
		// FlowLayout = places components in a row, sized at their preferred size.
		//              If the horizontal space in the container is too small,
		//              the FlowLayout class uses the next available row.
		
//		JFrame frame = new JFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
	//	this.setLayout(new FlowLayout()); //default; if blank, it will be CENTERED
	//	this.setLayout(new FlowLayout(FlowLayout.LEADING)); 
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());
		
	//	JButton button1 = new JButton();
	//	frame.add(button1);
		panel.add(new JButton("1")); // short version of the two codes above
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		this.add(panel);
		this.setVisible(true); // add at the end of the code
	}
}
