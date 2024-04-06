package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyComboBox extends JFrame implements ActionListener{

	// JComboBox = a component that combines a button 
	//             or editable field and a drop-down list
	
	JComboBox comboBox;
	
	
	
	MyComboBox(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		// In comboBox, wrapper type version should be used
		// below arrays will not work ; primitive data type
		int[] nums = {1,2,3};
		double[] nums2 = {1.0,2.0,3.0};
		
		// ComboBox will work on the following wrapper type
		Integer[] nums3 = {1,2,3};
		Double[] nums4 = {1.0,2.0,3.0};
		
		String[] animals = {"none","dog","cat","bird"};
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
//		comboBox.setEditable(true);
//		System.out.println(comboBox.getItemCount());	
		comboBox.addItem("horse"); // add item to the last position 
		comboBox.insertItemAt("pig", 1); // insert an item in a specific position (index)
		comboBox.setSelectedIndex(0); // set the initial position or index selected
		comboBox.removeItem("cat"); // remove a specific item
		comboBox.removeItemAt(2); // remove an item based on position or index number
//		comboBox.removeAllItems(); //remove all items
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem()); // return the element
			System.out.println(comboBox.getSelectedIndex()); // return index number
		}
		
	}

}
