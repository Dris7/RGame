package MyGame;

import javax.swing.SwingUtilities;

public class testGame {
	public static void main(String[] args) {
		
		
		SwingUtilities.invokeLater(()->{
			
			new GameFrame();
			
		});
	}

}
