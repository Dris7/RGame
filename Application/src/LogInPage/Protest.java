package LogInPage;

import javax.swing.SwingUtilities;

import modelbd.User;

public class Protest {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			
			new UserFrame(null);
		});
	}

}
