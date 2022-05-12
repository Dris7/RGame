package Graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GraphicPanel extends JPanel implements KeyListener {
	
	final int HEIGHT=600;
	final int WIDTH=800;
	private int Wimage;
	private int Himage;
	int score=0;
	Image image;
	Image image1;
	boolean gameover=false;
	int Vx=30;
	int Vy=30;
	int x=0;
	int y=0;
	int Hx=200;
	int Hy=HEIGHT-60;
	GraphicFrame frame;
	Timer t;
	
	int times;
	
	GraphicPanel(GraphicFrame frame){
		this.frame=frame;
		
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setBackground(new Color(46,46,46));
		image=new ImageIcon("hd.png").getImage();
		Wimage=new ImageIcon("hd.png").getIconWidth();
		Himage=new ImageIcon("hd.png").getIconHeight();
		image1=new ImageIcon("d.jpg").getImage();
		System.out.println("h"+image1.getHeight(frame));
		System.out.println("w"+image1.getWidth(frame));
		frame.addKeyListener(this);
                ;
		
			


		
		t=new Timer(90,(e)->{
			
			if(y<0)
			{
				times=0;
				Vy*=-1;
			}
			else if (y==0&&x==0) {
				Vy*=-1;
				
			}
			else if(x>=WIDTH-Wimage||x<0) {
				times=0;
				Vx*=-1;
			}
				
			else if(x>Hx-40&&x<Hx+95&&y>Hy-75&&times==0){
				times++;
				Vy*=-1;
				
				
				score++;
			}
			else if(y>=Hy-10) {
				gameover=true;
				t.stop();
				
			}
			
			
			x=x+Vx;
			//Hx=x;
			
			
			y=y+Vy;
			
			
			
			
			repaint();
			
			
			
			
			
			
			
			
		});
		
	
		t.start();
		
		
		
		
		
		
		
		
	}
	public void keyPressed(KeyEvent e) {
				
				switch(e.getKeyCode()) {
				
				case 39 :
					if(Hx>WIDTH-100)
						break;
					Hx+=70;
					repaint();
					
					break;
				case 37:
					if(Hx<0)
						break;
				Hx-=70;
				
				repaint();
					break;
				
				
				
				}
				
			}
	
	
	
	public void paint(Graphics g) {
		
		Graphics2D g2D=(Graphics2D)g;
		 super.paint(g2D);
		 if(gameover) {
			 g2D.setPaint(Color.black);
			 g2D.fillRect(0, 0, WIDTH, HEIGHT);
			 g2D.setPaint(Color.RED);
				g2D.setFont(new Font(null,Font.BOLD,70));
				
				g2D.drawString("GAME OVER",(WIDTH-390)/2,300);
				g2D.setPaint(Color.GREEN);
				g2D.setFont(new Font(null,Font.BOLD,40));
			     g2D.drawString("Score:"+score,(WIDTH-150)/2,350);
		 }else {
		g2D.drawImage(image, x,y,null);
		g2D.drawImage(image1, Hx,Hy,null);
		g2D.setPaint(Color.RED);
		g2D.setFont(new Font(null,Font.BOLD,40));
		g2D.drawString("Score:"+score,(WIDTH-150)/2,50);
		 }
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
	
	}
		
		
	


}
