import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Asst10Q2 extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4;
    JLabel l1;
    JLabel p[];
    int currentPos = 13;
    Asst10Q2()
    {
   	 JFrame f = new JFrame();
   	 
   	 Color Black = Color.black;
   	 Color White = Color.white;
   	 Color temp;
   	 p = new JLabel[16];
   	 f.setLayout(new GridLayout(5,4));
   	 int j=0;
   	 for(int i=1; i<=16; i++)
   	 {
   		 p[i-1] = new JLabel();
   		 if(i%2==0)
   		 {
   			 p[i-1].setBackground(White);
   			 p[i-1].setOpaque(true);
   		 }
   		 else
   		 {
   			 p[i-1].setBackground(Black);
   			 p[i-1].setOpaque(true);
   		 }
   		 
   		 if(i%4==0)
   		 {
   			 temp = Black;
   			 Black = White;
   			 White = temp;
   		 }
   		 
   		 f.add(p[i-1]);
   	 }
   	 
   	 l1 = new JLabel("*");
   	 l1.setForeground(Color.red);
   	 
   	 b1 = new JButton("Up");
   	 b1.addActionListener(this);
   	 
   	 b2 = new JButton("Down");
   	 b2.addActionListener(this);
   	 
   	 b3 = new JButton("Left");
   	 b3.addActionListener(this);
   	 
   	 b4 = new JButton("Right");
   	 b4.addActionListener(this);
   	 
   	 f.add(b1);
   	 f.add(b2);
   	 f.add(b3);
   	 f.add(b4);
   	 f.setSize(400,500);
   	 f.setVisible(true);
   	 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
   	 if(ae.getSource()==b1)
   	 {
   		 if((currentPos-4)>=0)
   		 {
   			 p[currentPos].setText("");
   			 currentPos -= 4;
   			 changePos();
   		 }
   	 
   		 else
   		 {
   			 JOptionPane.showMessageDialog(b1,"Up Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
   		 }
   	 }
   	 else if(ae.getSource()==b2)
   	 {
   		 if((currentPos+4)<16)
   		 {
   			 p[currentPos].setText("");
   			 currentPos += 4;
   			 changePos();
   		 }
   		 else
   		 {
   			 JOptionPane.showMessageDialog(b2,"Down Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
   		 }
   	 }
   	 else if(ae.getSource()==b3)
   	 {
   		 if((currentPos-1)>=0)
   		 {
   			 p[currentPos].setText("");
   			 currentPos -= 1;
   			 if((currentPos)==3||(currentPos)==7||(currentPos)==11)
   			 {
   				 currentPos += 1;
   				 changePos();
   				 JOptionPane.showMessageDialog(b3,"Left Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
   			 }
   			 else
   			 {
   				 changePos();
   			 }
   		 }
   		 else
   		 {
   			 changePos();
   			 JOptionPane.showMessageDialog(b3,"Left Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
   		 }
   	 }
   	 else
   	 {
   		 if((currentPos+1)<16)
   		 {
   			 p[currentPos].setText("");
   			 currentPos += 1;
   			 if((currentPos)==4||(currentPos)==8||(currentPos)==12)
   			 {
   				 currentPos -= 1;
   				 changePos();
   				 JOptionPane.showMessageDialog(b4,"Right Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
   			 }
   			 else
   			 {
   				 changePos();
   			 }
   		 }
   		 else
   		 {
   			 changePos();
   			 JOptionPane.showMessageDialog(b4,"Right Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
   		 }
   	 }
    }
    void changePos()
    {
   	 p[currentPos].setText("*");
   	 p[currentPos].setFont(new Font("Curior",Font.BOLD,25));
   	 p[currentPos].setHorizontalAlignment(JLabel.CENTER);
   	 
   	 if(p[currentPos].getBackground()==Color.black)
   	 {
   		 p[currentPos].setForeground(Color.white);
   	 }   	 
    }    
    public static void main(String args[])
    {
   	 new Asst10Q2();
    }
}
