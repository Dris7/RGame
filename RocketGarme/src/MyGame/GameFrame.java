package MyGame;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	private GraphicsPanel gpanel;
	
	public GameFrame(){
		super("Rocket Game");
		gpanel=new GraphicsPanel(this);
		this.setIconImage(new ImageIcon("rocketicon.png").getImage());

		
		this.setLayout(new BorderLayout());
		this.add(gpanel,BorderLayout.CENTER);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
		
	}

}
