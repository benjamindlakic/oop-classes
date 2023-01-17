package noticeboard;

import javax.swing.SwingUtilities;

public class main {
	public static void main(String[] args) {
		NoticeBoard board = new NoticeBoard();
		SwingUtilities.invokeLater(board);
	}
}
