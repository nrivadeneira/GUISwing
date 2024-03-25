package main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyButtonLambda extends JFrame{
	
	JButton button;
	
	MyButtonLambda(){
		
		button = new JButton();
		button.setBounds(200, 200, 100, 50);
		button.addActionListener(e -> System.out.println("poo")); // part with Lambda
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		
	}

}
