package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyLaunchPage implements ActionListener{ 
	
	// to execute: run the code below in the main.java
//	MyLaunchPage launchPage = new MyLaunchPage();

	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Window");
		
	MyLaunchPage(){
		
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==myButton) {
			frame.dispose(); // new window will only open once; this code will close us of of our frame, in this case our MyLaunchPage frame
			MyNewWindow newWindow = new MyNewWindow(); // call the MyNewWindow class
						
		}
		
	}
	
}
