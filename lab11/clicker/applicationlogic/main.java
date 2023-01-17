package clicker.applicationlogic;

import javax.swing.SwingUtilities;

import clicker.ui.userInterfaceCalc;

public class main {
	public static void main(String[] args) {
		/*Calculator calc = new PersonalCalculator();
		System.out.println("Value " + calc.giveValue());
		calc.increase();
		System.out.println("Value " + calc.giveValue());
		calc.increase();
		System.out.println("Value " + calc.giveValue());*/
		
		Calculator calc2 = new PersonalCalculator();
		userInterfaceCalc uiC = new userInterfaceCalc(calc2);
		SwingUtilities.invokeLater(uiC);
	}
	
}
