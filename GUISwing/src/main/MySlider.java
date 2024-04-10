package main;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class MySlider implements ChangeListener{
	
	// JSlider = GUI component that lets user enter a value
	//           by using an adjustable sliding knob on a track
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
	MySlider(){
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50); // (starting value, ending value, starting value)
		
		slider.setPreferredSize(new Dimension(400,200)); 
		
		//set minor ticks
		slider.setPaintTicks(true); // by default, this is set to false
		slider.setMinorTickSpacing(5); // shows the distance between each tick
		
		//set major ticks
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		//set labels of the MAJOR ticks
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli",Font.PLAIN,15));
		
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText("°C = "+slider.getValue());
		label.setFont(new Font("MV Boli",Font.PLAIN,25));
		
		// added stateChanged method will apply
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// to get value of the slider and show it to the label 
		label.setText("°C = "+slider.getValue());
		
	}

}
