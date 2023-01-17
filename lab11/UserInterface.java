

import java.awt.Dimension;
import java.awt.Container;
import javax.swing.*;

public class UserInterface implements Runnable {
	private JFrame frame;
	
	public UserInterface() {
		
	}

	@Override
	public void run() {
		frame = new JFrame("Swing on");
		frame.setPreferredSize(new Dimension (400, 200));
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createComponents(Container container) {
		
		BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(layout);
		
		
		container.add(new JLabel("Are you sure?"));
		
		JCheckBox  yes = new JCheckBox ("Yes!");
		JCheckBox  no = new JCheckBox ("No!");
		
		
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(yes);
		buttonGroup.add(no);
		
		container.add(new JLabel("Why?"));
		 
		JRadioButton one = new JRadioButton("No reason.");
		JRadioButton two = new JRadioButton("Because it is fun.");
		
		buttonGroup.add(one);
		buttonGroup.add(two);
		

		container.add(new JButton("Done"));
		
	}
	
	public JFrame getFrame() {
		return frame;
	}

}
