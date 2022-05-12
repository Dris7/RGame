package Graphics;
import java.awt.*;


import javax.swing.*;

public class GraphicFrame extends JFrame {
	private GraphicPanel panel ;
	GraphicFrame(){
		super("Playing");
		
		panel=new GraphicPanel(this);
		
		
		this.add(panel);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(new ImageIcon("i.jpg").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
	}

	
	
	
	
}
