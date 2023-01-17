package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class NoticeBoard implements Runnable {
	
	private JFrame frame;
	
	public NoticeBoard() {
		frame = new JFrame("");
		frame.setPreferredSize(new Dimension (400, 200));
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createComponents(Container container) {
	
		GridLayout layout = new GridLayout(3, 1);
		container.setLayout(layout);
		
		JTextField textField = new JTextField();
		JButton copyButton = new JButton("Copy!");
		JLabel label = new JLabel("I was copied here from the JTextArea.");
		
		
		// event listener
		
		ActionEventListener listener = new ActionEventListener(textField, label);
		copyButton.addActionListener(listener);
		
		container.add(textField);
		container.add(copyButton);
		container.add(label);
		container.add(new JLabel(""));

		
		
	}

	@Override
	public void run() {
		
	}
	
}
