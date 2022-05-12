package LogInPage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import Controller.Controller;

public class SinginFrame extends JFrame{
   
	private SinginPanel spanel;
	private LogoPanel lpanel;
	private  Controller controller;
	private LogInPanel lgpanel;
	private TableFrame tframe;
	private JMenuBar menu;
	private JMenu file;
	private JMenuItem showuser;
	private JMenuItem exit;
	
	
	
	public SinginFrame() throws IOException{
		super("Sing Up");
		
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
		
		
		spanel=new SinginPanel();
		lpanel=new LogoPanel();
		lgpanel=new LogInPanel();
		controller= new Controller();
		menu=new JMenuBar();
		menu.setBackground(Color.LIGHT_GRAY);
		menu.setBorderPainted(false);
		menu.setBorder(BorderFactory.createEtchedBorder());
		file=new JMenu("File");
		file.setFont(new Font(null,Font.BOLD,13));
		file.setForeground(Color.darkGray);
		file.setBorderPainted(false);
		
		file.setBackground(new Color(245,247,246));
		file.setBorderPainted(false);
		menu.add(file);
		showuser=new JMenuItem("Show data");
		file.add(showuser);
		exit=new JMenuItem("Exit");
		file.addSeparator();
		file.add(exit);
		exit.addActionListener((e)->{
			
			this.dispose();
			
		});
		
		
		
		
		
		
		
		
		
//		try {
//			controller.getdb().loadfromFile(new File("data.ser"));
//			
//		} catch (Exception e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
		
		
		
		
		//users.setusers(controller.getdb().getUsers());
		spanel.getLogin().addActionListener((e)->{
			
//			this.getContentPane().remove(spanel);
//			this.getContentPane().add(lgpanel);
//			this.revalidate();
			this.dispose();
			new LoginFrame();
			
			
			
			
		
		});
		spanel.setButtonlist((action)->{
        
			
		      
				try {
					controller.adduser(action);
					controller.savetoFile(new File("data.ser"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				if (tframe!=null)
			tframe.revalidate();
		
		
	
		});
	 
           showuser.addActionListener((e)->{
		 tframe=new TableFrame(controller);	
			
			
		});
		
		
	   
	    
	  
         
		
		this.setLayout(new BorderLayout());
		this.setJMenuBar(menu);
		this.add(spanel,BorderLayout.CENTER);
		this.add(lpanel,BorderLayout.EAST);
		this.setIconImage(new ImageIcon("icon.png").getImage());
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
		
		
	}

	public static Date getDate(String date) {
		Date dt=new Date(0,0,0);
		int in=0;
		
		int [] pos =new int[2];
		for(int i=0;i<date.length();i++){
			if(date.charAt(i)=='/') {
				pos[in]=i;
				in++;
				
				//System.out.println(i);
				
			}
			
			
		}
		dt.setDay(Integer.parseInt(date.substring(0, pos[0])));
		//System.out.println(date.substring(0, pos[0]));
		dt.setMonth(Integer.parseInt(date.substring(pos[0]+1, pos[1])));
		//System.out.println(date.substring(pos[0]+1, pos[1]));
		dt.setYear(Integer.parseInt(date.substring(pos[1]+1)));
		//System.out.println(date.substring(pos[1]+1));
		
		
		
		return dt;
	}
	
	
	
	
}
