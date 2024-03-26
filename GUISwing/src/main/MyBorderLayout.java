package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyBorderLayout {
	
	MyBorderLayout() {
	
	// Layout Manager = Defines the natural layout for components within a container
	
	// 3 common managers
	
	// BorderLayout = places components in five areas: NORTH, SOUTH, EAST, WEST, CENTER
	//              = all extra spaces are placed inside the center area
	
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new BorderLayout()); // margins = BorderLayout (width,height)
	frame.setSize(500,500);
	frame.setVisible(true);
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	
	panel1.setBackground(Color.blue);
	panel2.setBackground(Color.green);
	panel3.setBackground(Color.red);
	panel4.setBackground(Color.yellow);
	panel5.setBackground(Color.magenta);
	
	panel1.setPreferredSize(new Dimension(100,100));
	panel2.setPreferredSize(new Dimension(100,100));
	panel3.setPreferredSize(new Dimension(100,100));
	panel4.setPreferredSize(new Dimension(100,100));
	panel5.setPreferredSize(new Dimension(100,100));
	
	//-------------sub panels-------------------// 
	// if you want to add panels inside another panel 
	
	JPanel panel6 = new JPanel();
	JPanel panel7 = new JPanel();
	JPanel panel8 = new JPanel();
	JPanel panel9 = new JPanel();
	JPanel panel10 = new JPanel();
	
	panel6.setBackground(Color.black);
	panel7.setBackground(Color.darkGray);
	panel8.setBackground(Color.gray);
	panel9.setBackground(Color.lightGray);
	panel10.setBackground(Color.white);
	
	panel5.setLayout(new BorderLayout());
	
	panel6.setPreferredSize(new Dimension(50,50));
	panel7.setPreferredSize(new Dimension(50,50));
	panel8.setPreferredSize(new Dimension(50,50));
	panel9.setPreferredSize(new Dimension(50,50));
	panel10.setPreferredSize(new Dimension(50,50));
	
	panel5.add(panel6,BorderLayout.NORTH);
	panel5.add(panel7,BorderLayout.EAST);
	panel5.add(panel8,BorderLayout.SOUTH);
	panel5.add(panel9,BorderLayout.WEST);
	panel5.add(panel10,BorderLayout.CENTER);
	
	//---------another sub panel----------------//
	
	JPanel panel11 = new JPanel();
	JPanel panel12 = new JPanel();
	JPanel panel13 = new JPanel();
	JPanel panel14 = new JPanel();
	JPanel panel15 = new JPanel();
	
	panel11.setBackground(Color.black);
	panel12.setBackground(Color.darkGray);
	panel13.setBackground(Color.gray);
	panel14.setBackground(Color.lightGray);
	panel15.setBackground(Color.white);
	
	panel1.setLayout(new BorderLayout());
	
	panel11.setPreferredSize(new Dimension(20,20));
	panel12.setPreferredSize(new Dimension(20,20));
	panel13.setPreferredSize(new Dimension(20,20));
	panel14.setPreferredSize(new Dimension(20,20));
	panel15.setPreferredSize(new Dimension(20,20));
	
	panel1.add(panel11,BorderLayout.NORTH);
	panel1.add(panel12,BorderLayout.EAST);
	panel1.add(panel13,BorderLayout.SOUTH);
	panel1.add(panel14,BorderLayout.WEST);
	panel1.add(panel15,BorderLayout.CENTER);
	
	//-----------end of sub panel----------//
	
	frame.add(panel1,BorderLayout.NORTH);
	frame.add(panel2,BorderLayout.EAST);
	frame.add(panel3,BorderLayout.SOUTH);
	frame.add(panel4,BorderLayout.WEST);
	frame.add(panel5,BorderLayout.CENTER);
	
	}
}
