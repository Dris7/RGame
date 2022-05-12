package LogInPage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LogoPanel extends JPanel {

	private Image logoimage;
	private final int IHIEGHT=420;
	private final int IWIDTH=700;
public LogoPanel() {
	this.setBackground(new Color(245,247,246));
	logoimage=new ImageIcon("logo-pro.jpg").getImage();
	
	this.setPreferredSize(new Dimension(IWIDTH,IHIEGHT));
	
	
}

public void  paint(Graphics g) {
	       Graphics2D G=(Graphics2D)g;
	       super.paint(g);
	       G.drawImage(logoimage, 0,0,null);
	  
	       
	       G.setFont(new Font(null,Font.ROMAN_BASELINE,15));
	       G.setPaint(Color.DARK_GRAY);
	       G.drawString("By : AtkouDriss", IWIDTH-270, IHIEGHT-40);
	       G.drawString("Contact Me : drissatkou7@gmail.com", IWIDTH-270, IHIEGHT-20);
	
}
	
	
	
}
