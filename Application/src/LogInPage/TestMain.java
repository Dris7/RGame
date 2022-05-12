package LogInPage;

import javax.swing.SwingUtilities;

public class TestMain {

	public static void main(String[] args) {
		
		
		SwingUtilities.invokeLater(()->{
			
			new LoginFrame();
			
		});

	}

}
