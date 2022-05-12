package LogInPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SidebarPanel extends JPanel{
	
	private JButton editprofile;
	private JButton home;
	private JLabel username;
	public SidebarPanel(String fullname) {
		
		editprofile =new JButton("Edit Profile");
		editprofile.setFont(new Font(null,Font.BOLD,15));
		editprofile.setForeground(new Color(100,114,135));
		editprofile.setFocusable(false);
		editprofile.setBorderPainted(false);
		home=new JButton("Home");
		home.setFont(new Font(null,Font.BOLD,15));
		home.setForeground(new Color(100,114,135));
		home.setFocusable(false);
		home.setBorderPainted(false);
		username=new JLabel(""+fullname);
		username.setFont(new Font(null,Font.BOLD,18));
		
		
		
		
		
		
		
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints g= new GridBagConstraints();
		g.insets=new Insets(0,5,30,5);
		g.gridx=0;
		g.gridy=0;
		this.add(username,g);
		g.anchor=GridBagConstraints.LINE_START;
		g.insets=new Insets(10,5,10,100);
		g.gridx=0;
		g.gridy=1;
		this.add(home,g);
		g.insets=new Insets(0,5,470,100);
		g.gridx=0;
		g.gridy=2;
		this.add(editprofile,g);
		this.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
		this.setBackground(new Color(245,247,246));
		
		
		
		
	}
	
	
	

}
