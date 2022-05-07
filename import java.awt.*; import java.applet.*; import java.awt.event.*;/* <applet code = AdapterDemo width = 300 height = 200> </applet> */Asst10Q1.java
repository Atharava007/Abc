import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code = Asst10Q1 width = 400 height = 300>
</applet>
*/

public class Asst10Q1 extends Applet implements KeyListener
{
    String msg = "";
    String msg1 = "";
    public void init()
    {
   	 addKeyListener(this);
    }
    public void keyTyped(KeyEvent ke)
    {
   	 char key1 = ke.getKeyChar();
   	 msg = msg+(char)key1;
   	 showStatus("Key Typed");
   	 repaint();
    }
    public void keyReleased(KeyEvent ke)
    {
   	 showStatus("Key Released");
   	 repaint();
    }
    public void keyPressed(KeyEvent ke)
    {
   	 int key = ke.getKeyCode();
   	 switch(key)
   	 {
   		 case KeyEvent.VK_F1:
   			 msg = msg+"F1 ";
   			 break;
   		 case KeyEvent.VK_F2:
   			 msg = msg+"F2 ";
   			 break;
   		 case KeyEvent.VK_F3:
   			 msg = msg+"F3 ";
   			 break;
   		 case KeyEvent.VK_F4:
   			 msg = msg+"F4 ";
   			 break;
   		 case KeyEvent.VK_F5:
   			 msg = msg+"F5 ";
   			 break;
   		 case KeyEvent.VK_F6:
   			 msg = msg+"F6 ";
   			 break;
   		 case KeyEvent.VK_F7:
   			 msg = msg+"F7 ";
   			 break;
   		 case KeyEvent.VK_F8:
   			 msg = msg+"F8 ";
   			 break;
   		 case KeyEvent.VK_F9:
   			 msg = msg+"F9 ";
   			 break;
   		 case KeyEvent.VK_F10:
   			 msg = msg+"F10 ";
   			 break;
   		 case KeyEvent.VK_F11:
   			 msg = msg+"F11 ";
   			 break;
   		 case KeyEvent.VK_F12:
   			 msg = msg+"F12 ";
   			 break;
   		 case KeyEvent.VK_RIGHT:
   			 msg = msg+"right ";
   			 break;
   		 case KeyEvent.VK_LEFT:
   			 msg = msg+"left ";
   			 break;
   		 case KeyEvent.VK_UP:
   			 msg = msg+"up ";
   			 break;
   		 case KeyEvent.VK_DOWN:
   			 msg = msg+"down ";
   			 break;
   	 }
   	 repaint();
    }
    public void paint(Graphics g)
    {
   	 g.drawString(msg,50,50);
    }
}
