package LogInPage;

import java.io.IOException;

import javax.swing.SwingUtilities;

public class SingUptest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(()->{
			try {
				new SinginFrame();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});

	}

}
