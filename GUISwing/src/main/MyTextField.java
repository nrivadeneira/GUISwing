package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyTextField extends JFrame implements ActionListener{

	// JTextField = a GUI textbox component that can be used to add, set, or get text
	
	JButton button;
	JTextField textField;
	
	MyTextField(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.PLAIN,35));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white); //change color of the text cursor line
		textField.setText("username"); // add a default value in the text field
				
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Welcome "+textField.getText());
			button.setEnabled(false); // added to disable button after 1 click
			textField.setEditable(false); // added if you do NOT want the text field to be edited
		}
		
	}

	
	
	
}
