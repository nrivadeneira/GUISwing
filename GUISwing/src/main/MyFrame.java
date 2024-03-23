package main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){ //instance 

		this.setTitle("GCC"); //sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application when x button is clicked
		this.setResizable(false); //prevent this from being resized
		this.setSize(420,420); //sets the x-dimension, and y-dimension of this
		this.setVisible(true); //make this visible
		
		ImageIcon imageLogo = new ImageIcon("./src/logo.png"); //create an ImageIcon
		this.setIconImage(imageLogo.getImage()); //change icon of this
//		this.getContentPane().setBackground(Color.cyan); //change color of background,pick from predetermined color
		this.getContentPane().setBackground(new Color(224, 255, 255)); //change color of background using rgb code
		
	}

}
