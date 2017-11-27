package EX4_1;
import javax.swing.*; 
public class VivratingFrame extends JFrame implements Runnable 
{ 
	public VivratingFrame() 
 {
		super("진동하는 프레임 만들기"); 
      // TODO Auto-generated constructor stub 
       this.setVisible(true); 
       this.setSize(500,400);   
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       Thread thread = new Thread(this);//스레드 생성 
       thread.start();//스레드 시작 
    } 
    @Override 
    public void run() 
    { 
       // TODO Auto-generated method stub 
       while(true) 
       {    
          int rx = (int)(Math.random()*10); 
          int ry = (int)(Math.random()*10);//움직일 값을 얻어옴 
          this.setLocation(200+rx, 200+ry);//진동 시키기    
       } 
    } 

    public static void main(String arg[]) 
    { 
       new VivratingFrame(); 
    }
} 

