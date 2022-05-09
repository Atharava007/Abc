import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code = CEQ1 width = 400 height = 300>
</applet>
*/

public class CEQ1 extends Applet implements ActionListener
{
	Button lowerCase,upperCase,italic,bold;
	Label welcome,resultLower,resultUpper,resultItalic,resultBold;
	public void init()
	{
		setLayout(null);
		Label heading = new Label("String Operations");
		heading.setBounds(135,20,100,30);
		add(heading);
		
		Label string = new Label("String:");
		string.setBounds(80,60,100,30);
		add(string);
		
		welcome = new Label("Welcome");
		welcome.setBounds(260,60,100,30);
		add(welcome);
		
		lowerCase = new Button("LOWER CASE");
		lowerCase.setBounds(80,100,100,30);
		lowerCase.addActionListener(this);
		add(lowerCase);
		
		resultLower = new Label();
		resultLower.setBounds(260,100,100,30);
		add(resultLower);
		
		upperCase = new Button("UPPER CASE");
		upperCase.setBounds(80,140,100,30);
		upperCase.addActionListener(this);
		add(upperCase);
		
		resultUpper = new Label();
		resultUpper.setBounds(260,140,100,30);
		add(resultUpper);
		
		italic = new Button("Italic");
		italic.setBounds(80,180,100,30);
		italic.addActionListener(this);
		add(italic);
		
		resultItalic = new Label();
		resultItalic.setBounds(260,180,100,30);
		add(resultItalic);
		
		bold = new Button("Bold");
		bold.setBounds(80,220,100,30);
		bold.addActionListener(this);
		add(bold);
		
		resultBold = new Label();
		resultBold.setBounds(260,220,100,30);
		add(resultBold);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = welcome.getText();
		if(ae.getSource()==lowerCase)
		{
			resultLower.setText(str.toLowerCase());
		}
		else if(ae.getSource()==upperCase)
		{
			resultUpper.setText(str.toUpperCase());
		}
		else if(ae.getSource()==italic)
		{
			resultItalic.setFont(new Font("Dialog",Font.ITALIC,12));
			resultItalic.setText(str);
		}
		else if(ae.getSource()==bold)
		{
			resultBold.setFont(new Font("Dialog",Font.BOLD,12));
			resultBold.setText(str);
		}
	}
}		
