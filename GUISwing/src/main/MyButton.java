package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyButton extends JFrame implements ActionListener {
	
	// JButton = a button that performs an action when clicked
	
	JButton button;
	JLabel label;
	
	MyButton(){
		
		ImageIcon icon = new ImageIcon("./src/point.png");
		ImageIcon icon2 = new ImageIcon("./src/poo.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(175,250,150,150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(125, 100, 250, 100);
		button.addActionListener(this);
		button.setText("I am a button!");
		button.setFocusable(false); //border of the text that is visible on windows devices
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,10));
		button.setIconTextGap(-3);
		button.setForeground(Color.cyan); // set text color
//		button.setBackground(Color.black);
//		button.setOpaque(true); // to make background visible
//		button.setBorderPainted(false); // addt'l line to make background visible
//		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false); // to disable a button
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			System.out.println("poo");
//			button.setEnabled(false); // will only allow the button to be clicked 1 time
			label.setVisible(true); // once button is clicked, label will be visible
		
		}
		
	}

}
