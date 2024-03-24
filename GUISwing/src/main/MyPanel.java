package main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

	MyPanel(){

		// JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon image = new ImageIcon("./src/GCC Logo.png");
		
		
		JLabel label = new JLabel();
		label.setText("GCC");
		label.setIcon(image);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setIconTextGap(-22);
		//set the label to the top right of the panel where it was added
		//both can be disregarded is null setLayout is used
//		label.setVerticalAlignment(JLabel.TOP);
//		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(0, 0, 75, 75); //can be used if null setLayout is used
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
//		redPanel.setLayout(new BorderLayout());
		redPanel.setLayout(null); //alternative to new BorderLayout()
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
//		bluePanel.setLayout(new BorderLayout());
		bluePanel.setLayout(null); //alternative to new BorderLayout()
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
//		greenPanel.setLayout(new BorderLayout());
		greenPanel.setLayout(null); //alternative to new BorderLayout()
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750,750);
		frame.setLayout(null);
		frame.setVisible(true);
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
		//can be called by main using;
//		new MyPanel();
		
	}
}
