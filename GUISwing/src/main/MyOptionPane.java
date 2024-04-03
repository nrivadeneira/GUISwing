package main;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyOptionPane {

	// JOPtionPane = pop up a standard dialog box that prompts user for a value
	//               or informs them of something.
	
	MyOptionPane(){
			//showMessageDialog = show just a message
	//		JOptionPane.showMessageDialog(null,"This is a plain message","title",JOptionPane.PLAIN_MESSAGE);
	//		JOptionPane.showMessageDialog(null,"This is an information message","title",JOptionPane.INFORMATION_MESSAGE);
	//		JOptionPane.showMessageDialog(null,"This is a question message","title",JOptionPane.QUESTION_MESSAGE);
	//		JOptionPane.showMessageDialog(null,"This is a warning message","title",JOptionPane.WARNING_MESSAGE); //can be placed in a while(true){} loop so it will not close
	//		JOptionPane.showMessageDialog(null,"This is an error message","title",JOptionPane.ERROR_MESSAGE); 
			//------------------------------------------------
			
			//showConfirmDialog = can show yes, no, or cancel options
	//		JOptionPane.showConfirmDialog(null,"eme?","This is the title",JOptionPane.YES_NO_CANCEL_OPTION);
	//		System.out.println(JOptionPane.showConfirmDialog(null,"eme?","This is the title",JOptionPane.YES_NO_CANCEL_OPTION));
			// if placed inside a println statement and options are clicked, terminal will show its equivalent numerical values
			// yes = 0
			// no = 1
			// cancel = 2
			// x (close button) = -1
			
			// can also be stored in variables
	//		int answer = JOptionPane.showConfirmDialog(null,"eme?","This is the title",JOptionPane.YES_NO_CANCEL_OPTION);
			
			//-------------------------------------------------
			//showInputDialog = accepts input from user
	//		JOptionPane.showInputDialog("What is your name? ");
			//can be stored in variables
	//		String name = JOptionPane.showInputDialog("What is your name? ");
	//		System.out.println("Hello "+name);
			
			//-------------------------------------------------
			//showOptionDialog = combination of all
			
			String[] responses = {"No, you're awesome!","Thank you!","*blush*"};
			ImageIcon icon = new ImageIcon("./src/poo.png");
			JOptionPane.showInternalOptionDialog(
					null, 
					"You are awesome!", 
					"secret message", 
					JOptionPane.YES_NO_CANCEL_OPTION, 
					JOptionPane.INFORMATION_MESSAGE, 
					icon, 
					responses, 
					0);
			
	}
	
}
