package main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		/*
		//JFrame = a GUI window to add components to
		JFrame frame = new JFrame(); //create a frame
		frame.setTitle("GCC"); //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application when x button is clicked
		frame.setResizable(false); //prevent frame from being resized
		frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
		frame.setVisible(true); //make frame visible
		
		ImageIcon imageLogo = new ImageIcon("./src/logo.png"); //create an ImageIcon
		frame.setIconImage(imageLogo.getImage()); //change icon of frame
//		frame.getContentPane().setBackground(Color.cyan); //change color of background,pick from predetermined color
		frame.getContentPane().setBackground(new Color(224, 255, 255)); //change color of background using rgb code
		*/

		MyFrame myFrame = new MyFrame();
	}

}
