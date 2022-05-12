package LogInPage;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import Controller.Controller;
import modelbd.User;

public class LoginFrame extends JFrame {

private LogInPanel loginpanel;
private LogoPanel logopanel;
private Controller controller;
private boolean login=false;




public LoginFrame(){
super("Log In");




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

loginpanel=new LogInPanel();
logopanel=new LogoPanel();
controller=new Controller();

//System.out.println(controller.getdb().getUsers().get(0).getFullname());
loginpanel.getLogin().addActionListener((e)->{
	if(loginpanel.getuserame().isEmpty()||String.valueOf(loginpanel.getpassword()).isEmpty())
		{JOptionPane.showOptionDialog(this, "ERROR: password or username Field is empty", "ERROR!",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, null, 0);
		return;
		}
	User u = null;
	for(User user:controller.getdb().getUsers()) {
		
		if(loginpanel.getuserame().equals(user.getFullname())&&loginpanel.getpassword().equals(String.valueOf(user.getPassword()))) {
			u=user;
			login=true;
			
		}
		System.out.println(String.valueOf(user.getPassword()));
		
		
		
	}
	if(login)
	{//JOptionPane.showOptionDialog(this, "Welcome: "+u.getFullname(), "Loged in successfully",
			//JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 0);
	  this.dispose();
		new UserFrame(u);
		
	}
		else
		JOptionPane.showOptionDialog(this, "Wrong Infos", "Error Log in",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, null, 0);
	
      login=false;
	
	
});


loginpanel.getSingin().addActionListener((action)->{
//	this.dispose();
//	new SinginFrame();
	 
	 this.dispose();
	  try {
		new SinginFrame();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   this.revalidate();
	
});

this.setLayout(new BorderLayout());


this.add(logopanel,BorderLayout.CENTER);
this.add(loginpanel,BorderLayout.WEST);
this.setIconImage(new ImageIcon("icon.png").getImage());
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.pack();
this.setResizable(false);
this.setLocationRelativeTo(null);

this.setVisible(true);
	
}
	
}
/*
ToDo
logg in frame {
------------------------------------------------------------------------------
    (Longin panel)       Welcome To Log In Page.         |     Logopanel
                                                         |
        username :...............                        |
                                                         |     (some Image)
         password: ..............                        |
                                                         |
                          | | remember me                |
   | LongIn |                                            |
                    dont have an acount yet? SingIn.     |
------------------------------------------------------------------------------ 
}


*/