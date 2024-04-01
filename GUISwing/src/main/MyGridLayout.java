package main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyGridLayout extends JFrame{

	MyGridLayout(){
	// Layout Manager = Defines the natural layout for components within a container
	
	// GridLayout = places components in a grid of cells.
	//              Each component takes all the available space within its cell,
	//              and each cell is the same size.
	
		JFrame frame = new JFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
	//	this.setLayout(new GridLayout());
	//	this.setLayout(new GridLayout(9,1)); //(# rows, # columns)
		this.setLayout(new GridLayout(3,3,10,10)); //(# rows, # columns, # horizontal spacing, # vertical spacing)
		
		this.add(new JButton("1"));
		this.add(new JButton("2"));
		this.add(new JButton("3"));
		this.add(new JButton("4"));
		this.add(new JButton("5"));
		this.add(new JButton("6"));
		this.add(new JButton("7"));
		this.add(new JButton("8"));
		this.add(new JButton("9"));
		this.add(new JButton("10"));
		
		this.setVisible(true);
	}
}
