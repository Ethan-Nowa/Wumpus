import static javax.swing.SwingUtilities.invokeLater;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
	    invokeLater(() -> {
	        JFrame f = new JFrame();
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setTitle("Hunt The Wumpus");
	        f.setResizable(false);
	        f.add(new Wumpus(), BorderLayout.CENTER);
	        f.pack();
	        f.setLocationRelativeTo(null);
	        f.setVisible(true);
	    });
	}

}
