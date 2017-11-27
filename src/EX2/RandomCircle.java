package EX2;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import java.util.Random;  

 
 public class RandomCircle extends JFrame {	  
  	public RandomCircle() {   
  		setTitle("���� ������ ��ġ�� �̵�");  
  		setDefaultCloseOperation(EXIT_ON_CLOSE); 
  		 
  		final MyPanel panel = new MyPanel();    
  		setContentPane(panel);   
  	     
  		setSize(300, 300);   
  		setVisible(true);   
  	} 
  	// JPanel�� ��ӹ޴� MyPanel class
 	class MyPanel extends JPanel {   
 		public MyPanel() {   
 			new Thread (new Runnable() {  
  				public void run() { 
  					try { 
  						while( true ) {  
  							repaint();   
  							Thread.sleep(400); // ������ 400ms
  						}  
  					} catch(Exception e) {   
  						return; 
 					}   
  				} 
  			}).start(); 
 		} 
 		// ���� ������ ��ġ�� ������Ű�� ������Ʈ 
 		public void paintComponent(Graphics g) { 
 			Random r = new Random(); 
			int x = r.nextInt(getWidth()-50); 
			int y = r.nextInt(getHeight()-50); 
 			g.clearRect(0, 0, getWidth(), getHeight());
 			g.drawOval(x, y, 50, 50); // ������ 50�ȼ��� �� 
 		}   
  	}   
  	public static void main(String[] args) {   
  		new RandomCircle();   
     }   
  }   
