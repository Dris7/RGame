package Graphics;
import javax.swing.*;
import java.awt.*;

public class WelcomeFrame extends JFrame{

	private ImagePanel imagepanel;
	private JPanel Startpanel;
	private JButton Start;
	private JButton exit;
	private JLabel bname;
	private JLabel bemail;

	WelcomeFrame(){
		super("Ball Game");
		
		imagepanel=new ImagePanel();
		Startpanel=new JPanel();
		Start=new JButton("start");
		exit=new JButton("Exit");
		bname=new JLabel("by:DrissAtkou");
		bname.setFont(new Font(null,Font.BOLD,15));
		bname.setForeground(Color.LIGHT_GRAY);
		
		exit.setFont(new Font(null,Font.BOLD,30));
		exit.setForeground(Color.YELLOW);
		exit.setBackground(new Color(46,46,46));
		exit.setFocusable(false);
		exit.setBorder(null);
		exit.addActionListener((action)->{
			
			// the exit commed
			System.exit(0);
			
			
			
		});
		exit.setBorder(BorderFactory.createMatteBorder(0, 0,2, 0,Color.YELLOW));
		Start.setBorder(BorderFactory.createMatteBorder(0, 0,2, 0,Color.YELLOW));
		Start.setFont(new Font(null,Font.BOLD,30));
		Start.setForeground(Color.YELLOW);
		Start.setBackground(new Color(46,46,46));
		Start.setFocusable(false);
		Start.setBorder(null);
		Start.setBorder(BorderFactory.createMatteBorder(0, 0,2, 0,Color.YELLOW));
		Start.addActionListener((e)->{
			new GraphicFrame();
			this.dispose();
			
		});
		Startpanel.setLayout(new GridBagLayout());
		GridBagConstraints g=new GridBagConstraints();
		g.insets=new Insets(50,0,0,0);
		g.gridx=1;
		g.gridy=3;
		Startpanel.add(Start,g);
		g.gridx=1;
		g.gridy=6;
		Startpanel.add(exit,g);
		g.insets=new Insets(100,0,0,0);
		g.gridx=0;
		g.gridy=7;
		Startpanel.add(bname,g);
		
		
		
		Startpanel.setBackground(new Color(46,46,46));
		Startpanel.setPreferredSize(new Dimension(200,28));
		this.setLayout(new BorderLayout());
		this.add(imagepanel,BorderLayout.CENTER);
		this.add(Startpanel,BorderLayout.WEST);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("i.jpg").getImage());
		this.setSize(new Dimension(200+415,28+450));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	
}
