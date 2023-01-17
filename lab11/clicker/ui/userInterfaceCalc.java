package clicker.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import clicker.applicationlogic.Calculator;

public class userInterfaceCalc implements Runnable {
	
	private JFrame frame;
	private Calculator calculator;
	
	public userInterfaceCalc(Calculator c) {
		this.calculator=c;
	}

	@Override
	public void run() {
		frame = new JFrame("Click effect");
		frame.setPreferredSize(new Dimension(400, 300));
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createComponents(Container container) {
		container.setLayout(new GridLayout(3, 1));
		
		JLabel label = new JLabel (String.valueOf(this.calculator.giveValue()));
		Button clickButton = new Button("Click");
		
		ClickListener listener = new ClickListener();
		clickButton.addActionListener(listener);
		
		container.add(label, BorderLayout.WEST);
		container.add(clickButton, BorderLayout.SOUTH);	
		
	}
	
	public JFrame getFrame() {
        return frame;
    }
}
