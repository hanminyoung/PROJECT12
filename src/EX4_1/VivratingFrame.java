package EX4_1;
import javax.swing.*; 
public class VivratingFrame extends JFrame implements Runnable 
{ 
	public VivratingFrame() 
 {
		super("�����ϴ� ������ �����"); 
      // TODO Auto-generated constructor stub 
       this.setVisible(true); 
       this.setSize(500,400);   
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       Thread thread = new Thread(this);//������ ���� 
       thread.start();//������ ���� 
    } 
    @Override 
    public void run() 
    { 
       // TODO Auto-generated method stub 
       while(true) 
       {    
          int rx = (int)(Math.random()*10); 
          int ry = (int)(Math.random()*10);//������ ���� ���� 
          this.setLocation(200+rx, 200+ry);//���� ��Ű��    
       } 
    } 

    public static void main(String arg[]) 
    { 
       new VivratingFrame(); 
    }
} 

