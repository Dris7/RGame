package LogInPage;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import modelbd.User;

public class UserFrame extends JFrame {

	private SidebarPanel sbpanel;
	private EmptyPanel emptypanel; 
	private User user;

	public UserFrame(User user) {
		
		super("Profile");
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		
		
		this.user=user;
		
		sbpanel=new SidebarPanel(null);
		emptypanel=new EmptyPanel();
		
		
		
		
		
		this.setLayout(new BorderLayout());
		this.add(sbpanel,BorderLayout.WEST);
		this.add(emptypanel,BorderLayout.CENTER);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
	
	
	
}
