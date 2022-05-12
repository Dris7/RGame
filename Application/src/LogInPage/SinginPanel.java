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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SinginPanel extends JPanel{
private JLabel fullname;
private JTextField fname;
private JLabel birthdate;
private JTextField bdate;
private JLabel gender;
private JRadioButton male;
private JRadioButton female;
private JLabel Email;
private JTextField email;

private JTextField country;
private JPasswordField password;
private JLabel Password;
private JCheckBox terms;
private JLabel singinpage;
private ButtonGroup gb;
private JButton create;
private JLabel desc; 
private JButton backlogin;
private ButtonListener Blistener;

	
	public SinginPanel() {
		backlogin=new JButton();
		backlogin.setBackground(new Color(245,247,246));
		backlogin.setFocusable(false);
		backlogin.setBorderPainted(false);
		backlogin.setBorder(BorderFactory.createMatteBorder(0,0,0,0, getBackground()));
		backlogin.setIcon(new ImageIcon("back.png"));
		//backlogin.setContentAreaFilled(false);
		
		
		backlogin.addMouseListener((MouseListener) new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				backlogin.setIcon(new ImageIcon("backClicked.png"));
				System.out.println("entered");
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				backlogin.setIcon(new ImageIcon("back.png"));
				
				
			}




			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			
			
			
		});
		
		fullname=new JLabel("Full Name:");
		fullname.setFont(new Font(null,Font.BOLD,15));
		fullname.setForeground(new Color(100,114,135));
		fname=new JTextField(15);
		fname.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(0,114,135)));
		fname.setBackground(new Color(245,247,246));
		fname.setFont(new Font(null,Font.CENTER_BASELINE,15));
		fname.setForeground(new Color(100,114,135));
		birthdate=new JLabel("Birthdate:");
		birthdate.setFont(new Font(null,Font.BOLD,15));
		birthdate.setForeground(new Color(100,114,135));
		 bdate =new JTextField(15);
		 bdate.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(0,114,135)));
			bdate.setBackground(new Color(245,247,246));
			bdate.setFont(new Font(null,Font.CENTER_BASELINE,15));
			bdate.setForeground(new Color(100,114,135));
		 gender =new JLabel("Gender:");
		 gender.setFont(new Font(null,Font.BOLD,15));
		 gender.setForeground(new Color(100,114,135));
		 male=new JRadioButton("Male");
		 male.setFont(new Font(null,Font.BOLD,15));
		 male.setForeground(new Color(100,114,135));
		 male.setBackground(new Color (245,247,246));
		 male.setFocusable(false);
		 male.setActionCommand("male");
		 male.setSelected(true);
		 female=new JRadioButton("Female");
		 female.setFont(new Font(null,Font.BOLD,15));
		 female.setForeground(new Color(100,114,135));
		 female.setBackground(new Color (245,247,246));
		 female.setFocusable(false);
		 female.setActionCommand("female");
		 gb=new ButtonGroup();
		 gb.add(female);
		 gb.add(male);
		 Email=new JLabel("Email:");
		 Email.setFont(new Font(null,Font.BOLD,15));
		 Email.setForeground(new Color(100,114,135));
		 email=new JTextField(15);
		 email.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(0,114,135)));
			email.setBackground(new Color(245,247,246));
			email.setFont(new Font(null,Font.CENTER_BASELINE,15));
			email.setForeground(new Color(100,114,135));
		
		 terms=new JCheckBox("I accept ");
		 terms.setForeground(new Color(100,114,135));
		 terms.setBackground(new Color (245,247,246));
		 terms.setFocusable(false);
		 terms.addActionListener((e)->{
			 if(terms.isSelected())
			 create.setEnabled(true);
			 else {
				 
				 create.setEnabled(false);
			 }
		 });
		 singinpage =new JLabel("Sing Up Page  ");
		 singinpage.setFont(new Font("sansserif",Font.BOLD,20));
		 singinpage.setForeground(new Color(0,114,138));
		 Password =new JLabel("Password:");
		 
		 Password.setFont(new Font(null,Font.BOLD,15));
		 Password.setForeground(new Color(100,114,135));
		 password=new JPasswordField(15);
		 password.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(0,114,135)));
			password.setBackground(new Color(245,247,246));
			password.setFont(new Font(null,Font.CENTER_BASELINE,15));
			password.setForeground(new Color(100,114,135));
		 create =new JButton("Create");
		 create.setFocusable(false);
		 create.setFont(new Font(null,Font.BOLD,20));
		 create.setBackground(Color.LIGHT_GRAY);
		 create.setForeground(new Color(0,120,135));
		 create.setBorderPainted(false);
		 create.setEnabled(false);
		 
		 
		 
		 create.addActionListener((action)->{
			 
			 Fevent event=new Fevent(this,
					 this.fname.getText(),
					 bdate.getText(),
					 gb.getSelection().getActionCommand(),
					 email.getText(),
					 password.getPassword()
					 
					 );
			 if(Blistener!=null)
				 Blistener.setactionOcc(event);
			 
			          // clear the field after the creation
					 fname.setText(null);
					 bdate.setText(null);
					 email.setText("");
					 password.setText(null);
					 
			 
			 
			 
		 });
		 
		 
		 
		 desc =new JLabel("all the terms and licenses");
		 desc.setFont(new Font(null,Font.PLAIN,10));
		 desc.setForeground(new Color(100,114,135));
		 desc.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(245,247,246)));
		 
		 
		 this.setLayout(new GridBagLayout());
		 GridBagConstraints g=new GridBagConstraints();
		 g.fill=GridBagConstraints.NONE;
		 g.insets=new Insets(5,20,0,100);
		 g.anchor=GridBagConstraints.FIRST_LINE_START;
		 g.gridx=0;
		 g.gridy=0;
		 this.add(backlogin,g);
		 g.insets=new Insets(10,0,50,20);
		 g.gridx=1;
		 g.gridy=0;
		 this.add(singinpage,g);
		 g.insets=new Insets(10,0,10,20);
		 g.anchor=GridBagConstraints.LINE_END;
		 g.gridx=0;
		 g.gridy=1;
		 this.add(fullname,g);
		 
		 g.anchor=GridBagConstraints.LINE_START;
		 g.gridx=1;
		 g.gridy=1;
		 this.add(fname,g);
		 g.anchor=GridBagConstraints.LINE_END;
		 g.gridx=0;
		 g.gridy=2;
		 this.add(birthdate,g);
		 g.anchor=GridBagConstraints.LINE_START;
		 g.gridx=1;
		 g.gridy=2;
		 this.add(bdate,g);
		 g.anchor=GridBagConstraints.LINE_END;
		 g.gridx=0;
		 g.gridy=3;
		 this.add(gender,g);
		 //g.insets=new Insets(0,0,10,0);
		 g.insets=new Insets(0,5,0,5);
		 g.gridx=1;
		 g.gridy=3;
		 this.add(male,g);
		 g.anchor=GridBagConstraints.CENTER;
		
		 g.gridx=1;
		 g.gridy=3;
		 this.add(female,g);
		 g.insets=new Insets(10,0,20,20);;
		 g.anchor=GridBagConstraints.LINE_END;
		 g.gridx=0;
		 g.gridy=4;
		 this.add(Email,g);
		 g.anchor=GridBagConstraints.LINE_START;
		 g.gridx=1;
		 g.gridy=4;
		 this.add(email,g);
		 g.anchor=GridBagConstraints.LINE_END;
		 g.gridx=0;
		 g.gridy=5;
		 this.add(Password,g);
		 g.anchor=GridBagConstraints.LINE_START;
		 g.gridx=1;
		 g.gridy=5;
		 this.add(password,g);
		 g.insets=new Insets(0,0,20,0);
		 g.anchor=GridBagConstraints.LINE_END;
		 g.gridx=0;
		 g.gridy=6;
		 this.add(terms,g);
		
		 g.anchor=GridBagConstraints.LAST_LINE_START;
		 g.gridx=1;
		 g.gridy=6;
		 this.add(desc,g);
		 g.anchor=GridBagConstraints.LINE_END;
		 g.gridx=1;
		 g.gridy=7;
		 this.add(create,g);
		 this.setBackground(new Color (245,247,246));
		 this.setPreferredSize(new Dimension(470,230));
		 
		 
		 
		
		
		
		
		
		
		
	}
	public JButton getLogin() {
		return this.backlogin;
	}
	
	

	public void setButtonlist(ButtonListener blistener2) {
		// TODO Auto-generated method stub
		this.Blistener=blistener2;
		
	}
	
	
	

}
//	private String fullname;
//	private Date brithdate;
//	private Gender gender;
//	private String email;
//	private String Country;
//    private String password;

/*
 *                     Sing in page
 * -------------------------------------------------------------------------------                    
 *                                               |
 * Full name: .....                              |
 *                                               |
 * Birthdate: .....                              |
 *                                               |            (Logo image)
 * Gender :    O male                            |
 *             O female                          |
 *                                               |
 *  Email: ..............                        |
 *                                               |                              
 *  Country: .........                           |
 *                                               |
 *  PassWord: .......                            |
 *  confirmation ??                              |
 *  PassWord: .......                            |
 *                                               |
 *  (check) accepte all the terms and licences   |
 *                                               |
 *                                               |
 *  | Create |                                   |
 *                                               |
 * ---------------------------------------------------------------------------------
 * 
 * 
 */



