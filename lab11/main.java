
import java.util.ArrayList;

import javax.swing.SwingUtilities;

public class main {
	public static void main(String[] args) {
		/*FileManager f = new FileManager();
		
		for(String line : f.read("src\testinput1.txt")) {
			System.out.println(line);
		}
	}*/
		
		/*FileManager f = new FileManager();
		f.save("src\testinput1.txt", "hello");*/
		
		/*FileManager f = new FileManager();
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("object");
		list.add("oriented");
		list.add("programming");
		
		f.saveList("src\testinput1.txt", list);*/
		
		
		UserInterface ui = new UserInterface();
		SwingUtilities.invokeLater(ui);
		
	}
}
