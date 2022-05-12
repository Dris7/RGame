package LogInPage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LogInPanel extends JPanel {
	
	private JButton login;
	private JButton singin;
	private JLabel username;
	private JLabel password;
	private JTextField usrname;
    private JPasswordField psswrd; 
    private JLabel welecom;
    private JLabel desc;
    private JCheckBox remember;
    
     

	public LogInPanel() {
		
		remember=new JCheckBox("Remember me");
		remember.setFocusable(false);
		remember.setBackground(new Color(245,247,246));
		remember.setFont(new Font(null,Font.PLAIN,13));
		remember.setForeground(new Color(100,114,135));
		boolean a1;
		login =new JButton("Log in");
		
		login.setFont(new Font(null,Font.CENTER_BASELINE,15));
		login.setForeground(new Color(0,120,135));
		login.setFocusable(false);
		login.setBackground(Color.LIGHT_GRAY);
		
		login.setBorderPainted(false);
		login.setFont(new Font(null,Font.BOLD,18));
		
		
		
		login.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
				login.setBackground(new Color(240,240,240));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				login.setBackground(Color.LIGHT_GRAY);
				
			}
			
			
			
			
			
		});
		
		
		
		singin =new JButton("Sing up");
		singin.setFont(new Font(null,Font.BOLD,12));
		
		
		singin.setBorder(null);
		singin.setForeground(Color.red);
		singin.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,Color.red));
		singin.setFocusable(false);
		singin.setBackground(new Color(245,247,246));
		singin.setContentAreaFilled(false);
		singin.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				singin.setForeground(new Color(190,0,0));
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				singin.setForeground(Color.red);
				
			}
			
			
			
			
			
		});
		
		
		username=new JLabel("User Name :");
		username.setFont(new Font(null,Font.BOLD,15));
		username.setForeground(new Color(100,114,135));
		password=new JLabel("Password :");
		password.setFont(new Font(null,Font.BOLD,15));
		password.setForeground(new Color(100,114,135));
		usrname=new JTextField(15);
		usrname.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(0,114,135)));
		usrname.setBackground(new Color(245,247,246));
		usrname.setFont(new Font(null,Font.CENTER_BASELINE,15));
		usrname.setForeground(new Color(100,114,135));
		usrname.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
				usrname.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.blue));
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				usrname.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(0,114,135)));
				
			}
			
			
			
			
			
		});
		psswrd=new JPasswordField(15);
		
		
		psswrd.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(0,114,135)));
		psswrd.setBackground(new Color(245,247,246));
		psswrd.setFont(new Font(null,Font.CENTER_BASELINE,15));
		
		psswrd.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
				psswrd.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.blue));
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				psswrd.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(0,114,135)));
				
			}
			
			
			
			
			
		});
		
		
		
		psswrd.setForeground(new Color(100,114,135));
		welecom =new JLabel("Welecom To Login Page");
		welecom.setFont(new Font("sansserif",Font.BOLD,20));
		welecom.setForeground(new Color(0,114,135));
		desc = new JLabel("If you don't have an acount?");
		desc.setFont(new Font(null,Font.PLAIN,12));
		desc.setForeground(new Color(255,10,0));
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints g=new GridBagConstraints();
		g.insets=new Insets(0, 10, 40, 10);
		
		g.fill=GridBagConstraints.NONE;
		g.gridx=2;
		g.gridy=0;
		this.add(welecom,g);
		g.insets=new Insets(10, 3, 10, 3);
		g.anchor=GridBagConstraints.LINE_END;
		g.gridx=1;
		g.gridy=1;
		this.add(username,g);
		g.anchor=GridBagConstraints.LINE_START;
		g.gridx=2;
		g.gridy=1;
		this.add(usrname,g);
		g.anchor=GridBagConstraints.LINE_END;
		g.gridx=1;
		g.gridy=2;
		this.add(password,g);
		g.anchor=GridBagConstraints.LINE_START;
		g.gridx=2;
		g.gridy=2;
		this.add(psswrd,g);
		g.anchor=GridBagConstraints.LAST_LINE_START;
		g.insets=new Insets(30, 4, 30, 2);
		g.gridx=2;
		g.gridy=3;
		this.add(login,g);
		g.anchor=GridBagConstraints.FIRST_LINE_END;
		g.insets=new Insets(5, 0, 5, 40);
		g.gridx=2;
		g.gridy=3;
		this.add(remember,g);
		
		g.insets=new Insets(10, 2, 10, 2);
		g.gridx=2;
		g.gridy=4;
		this.add(desc,g);
		g.gridx=3;
		g.gridy=4;
		this.add(singin,g);
		this.setBackground(new Color (245,247,246));
		
		this.setPreferredSize(new Dimension(500,230));
		
	}	
		
	public JButton getSingin() {

		
		return this.singin;
	}	
	
	public JButton getLogin() {
		
		return this.login;
	} 
	public String getuserame() {
		
		return this.usrname.getText();
	}
	public String getpassword(){
		
		return String.valueOf(psswrd.getPassword());
	}
	
		
		
		
		
		
		
	
	
}
