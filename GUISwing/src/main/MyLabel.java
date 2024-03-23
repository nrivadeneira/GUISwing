package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyLabel extends JLabel {
	
	MyLabel(){

		ImageIcon image = new ImageIcon("./src/GCC Logo.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
//		JLabel = a GUI display area for a string of text, an image, or both
//		JLabel label = new JLabel("Bro, do you even code?"); //shot method of the code below
//		JLabel label = new JLabel();
		this.setText("G Cyber Cafe");
		this.setIcon(image);
		this.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
		this.setVerticalTextPosition(JLabel.BOTTOM); // set text TOP, CENTER, BOTTOM of imageicon
		this.setForeground(Color.black); // set font color of text
		this.setFont(new Font("Sans Serif",Font.BOLD,18)); // set font of text
		this.setIconTextGap(-25); // set gap of text to image
		this.setBackground(Color.black); // set background color
		this.setOpaque(true); // display background color
		this.setBorder(border); // sets border of the whole this (not only the image+text)
		this.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within this
		this.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within this
//		this.setBounds(100, 100, 250, 250); // use with frame.setLayout (x,y,width,height) set x,y position within frame as well as dimension
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500,500);
//		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(this);
		frame.pack(); // always use frame.add(label) before this code // can be used alternative to label.setBounds+frame.setLayout
		
		//use this to call from Main.java
//		MyLabel myLabel = new MyLabel(); // call the MyFrame class
//		new MyLabel(); //use this syntax if you will not use the declared variable like the code above
		
	}

}
