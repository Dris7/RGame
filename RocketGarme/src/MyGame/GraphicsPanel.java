package MyGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GraphicsPanel extends JPanel{
	
	private Timer timer;
	private int Vx;
	private final int HEIGHT=600;
	private final int WIDTH=820;
	private int Vy=0;
	private int x=0;
	private int y=0;
	private int Mx=0;
	private int My=0;
	private int rocketX=getrandomXLocation();
	private int score=0; 
	private boolean entered=false;
	private final int rocketY=(int) (600+(int)(this.getLocation().getY())-70);
	private int randomX=getrandomXLocation();
	private Image im=getMonster();
	private boolean shoot=false;
	boolean gameover=false;
	private JButton retry;
	private boolean boom =false;
	
	
	
	
	public GraphicsPanel(GameFrame frame ){
		
		
		this.setBackground(new Color(46,46,46));
		retry=new JButton();
		retry.setIcon(new ImageIcon("retry.png"));
		
		retry.setBackground(new Color(9,21,37));
		
		retry.setFocusable(false);
		retry.setBorderPainted(false);
		retry.setVisible(false);
		retry.addActionListener((e)->{
			
			frame.getContentPane().removeAll();
			frame.getContentPane().add(new GraphicsPanel(frame));
			frame.revalidate();
			
			
		});
		
		
		timer=new Timer(100,(action)->{
			if(entered==true) {
			My+=100;
			
			}
			else
			{My+=10;
			My+=score;}
			if(My>this.getLocation().getY()+HEIGHT+10)
			{
				My=0;
				entered=false;
				im=getMonster();
				randomX=getrandomXLocation();
			}
			if(gameover==true) {
				timer.stop();
			}
			repaint();
			
		});
		
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				 
				switch(e.getKeyCode()) {
				case 0 :
						
						shoot=true;
						break;}
				
			}
				
			

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				 
				switch(e.getKeyCode()) {
				case 0 :
						
						shoot=true;
						break;
				
				case 39:
					if(rocketX>=750)
						break;
					rocketX+=30;
					//System.out.println(rocketX);
					break;
				case 37:
					if(rocketX<25)
						break;
					rocketX-=30;
					//System.out.println(rocketX);
					break;
					
					
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			
				 
				
						shoot=false;
					
			
			
			}
			
			});
		
		
		
		
		timer.start();
		
      

		
		    
			this.setPreferredSize(new Dimension(WIDTH,HEIGHT));	
			
			this.setLayout(new GridBagLayout());
			GridBagConstraints gc=new GridBagConstraints();
			gc.gridx=0;
			gc.gridy=0;
			
			this.add(retry,gc);
			

	}
	
	
	
	public void paint(Graphics g) {
		
		Graphics2D G=(Graphics2D) g; 
		super.paint(G);
		G.drawImage(new ImageIcon("bg.jpg").getImage(), 0,0, null);
		if(!gameover) {
		if(shoot==true) {
			G.setPaint(Color.red);
			G.setStroke(new BasicStroke(5));
		G.drawLine(rocketX+33, rocketY, rocketX+33, 0);}//
		if(entered==false) {
		
		if(shoot==true&&randomX<=rocketX+33&&randomX+50>=rocketX+33) {
			System.out.println("hree");
			//G.drawImage(null,, My,null);
			//G.fillRect(randomX, My, 70, 50);
			entered=true;
			score++;
		
		
		
		}
		else  {
			
			G.drawImage(im,randomX, My,null);
			
			if(My>this.getLocation().getY()+HEIGHT-60) {
				//if(randomX<=rocketX+3)
				Point rocket =new Point (rocketX+30,rocketY+30);
				Point monster =new Point (randomX+14,My+14);
				if(rocket.distance(monster)<=35)
				{
					boom =true;
					
					//G.drawImage(new ImageIcon("explosion.png").getImage(), rocket.x,rocket.y+10,null);
				
				}
				
				gameover=true;
				
				}
			
			
			
			
		}
		}
		
		G.drawImage(new ImageIcon("rocket1.png").getImage(),
				rocketX, rocketY, null);
		if(boom ==true) {
			
			G.drawImage(new ImageIcon("explosion.png").getImage(),rocketX+8,rocketY+7,null);
			G.drawImage(new ImageIcon("explosion.png").getImage(),rocketX+8,rocketY+7,null);
			G.drawImage(new ImageIcon("explosion.png").getImage(),rocketX+8,rocketY+15,null);
			G.drawImage(new ImageIcon("explosion.png").getImage(),rocketX+8,rocketY,null);
			
			
		}
		G.setPaint(Color.LIGHT_GRAY);
		G.setFont(new Font(null,Font.BOLD,20));
		G.drawString("Score:"+score, (int)(this.getLocation().getX()+WIDTH-100)/2,50);
	
		}else {
			

			   super.paint(G);
			   G.drawImage(new ImageIcon("bg.jpg").getImage(), 0,0, null);
			   G.setFont(new Font(null,Font.BOLD,50));
			   G.setPaint(Color.red);
			   G.drawString("Game Over", 
					   280, 200);
			   G.setPaint(Color.GREEN);
				G.setFont(new Font(null,Font.BOLD,30));
			   G.drawString("Score:"+score, 
					   360, 250);
			   retry.setVisible(true);
			   G.setPaint(Color.white);
				G.setFont(new Font(null,Font.PLAIN,14));
			   G.drawString("Made By: drissatkou7@gmail.com", 
					   WIDTH-225,HEIGHT-15);
			
		}
	                
	}
	
	
	public Image getMonster() {
		
		int rand=(int)(Math.random()*3);
		
		
		Image [] image=new Image[3];
		image[0]=new ImageIcon("M1.png").getImage();
		image[1]=new ImageIcon("M22.png").getImage();
		image[2]=new ImageIcon("M3.png").getImage();
		return image[rand];
		
	}
	public int getrandomXLocation() {
		
		
		return (int)(Math.random()*(WIDTH+this.getLocation().getX()-80));
	}
	
	

}
