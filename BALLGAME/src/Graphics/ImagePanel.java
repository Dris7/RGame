package Graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

	private Image image;
	
	ImagePanel(){
		
		
		image=new ImageIcon("11.png").getImage();
		System.out.println("h"+new ImageIcon("11.png").getIconHeight());
		System.out.println("w"+new ImageIcon("11.png").getIconWidth());
		
		
	}
	
	
	
	
	public void paint(Graphics g) {
		
		Graphics2D G=(Graphics2D) g;
		
		G.drawImage(image,0, 0, null);
		
		
		
	}
	
	
	
	
	
	
	
	
}
