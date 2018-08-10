package dwong;

import java.awt.event.WindowAdapter;





public class Start extends WindowAdapter {
	public static void main(String[] args) {	
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

	private static void createAndShowGUI() {
		new Config();
		//new DwController();
	}

}
