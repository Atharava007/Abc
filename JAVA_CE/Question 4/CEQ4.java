import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code = CEQ4 width = 300 height = 200>
</applet>
*/

public class CEQ4 extends Applet
{
	String msg = "";
	public void init()
	{
		addMouseMotionListener(new myMouseListener());
		addKeyListener(new myKeyListener());
	}
	public class myMouseListener extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent me)
		{	
			showStatus(String.valueOf(me.getX())+","+String.valueOf(me.getY()));
		}
	}
	public class myKeyListener extends KeyAdapter
	{
		public void keyTyped(KeyEvent ke)
		{
			char key = ke.getKeyChar();
			msg = msg+key;
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,20,20);
	}		
}
