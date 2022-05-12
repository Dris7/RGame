package LogInPage;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import Controller.Controller;

public class TableFrame extends JFrame{
	
	private UsersTable tpanel;
	private Controller controller;
	private JButton refresh;
	public TableFrame(Controller controller) {
		this.controller=controller;
		refresh =new JButton("refresh");
		refresh.setFocusable(false);
		refresh.addActionListener((e)->{
			
			tpanel.refresh();
		});
		
		tpanel=new UsersTable();
		if(controller==null)return;
		if(controller.getdb().getUsers()==null)return;
		tpanel.setusers(controller.getdb().getUsers());
		
		
		
		
		
		this.setLayout(new BorderLayout());
		
		this.add(tpanel,BorderLayout.CENTER);
		this.add(refresh,BorderLayout.NORTH);
		
		this.pack();
		this.setResizable(true);
		
		this.setLocationRelativeTo(null);
	
		//this.setLocationRelativeTo(null);
		this.setVisible(true);

		
	}
	
	
	
	
	

}
