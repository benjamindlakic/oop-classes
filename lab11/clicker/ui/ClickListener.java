package clicker.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import clicker.applicationlogic.Calculator;

public class ClickListener implements ActionListener {
	
	private JLabel label;
	private Calculator calculator;

	@Override
	public void actionPerformed(ActionEvent e) {
		this.calculator.increase();
		this.label.setText(String.valueOf(this.calculator.giveValue()));
		
	}
	
}
