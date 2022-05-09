import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="random" width=0 height=50></applet>
*/

public class random extends Applet implements ActionListener {
    int n1, n2;
    Button Submit;
    TextField Answer;
    Label l1;

    public void init() {
        n1 = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        n2 = (int) Math.floor(Math.random() * (20 - 11 + 1) + 11);

        l1 = new Label(String.valueOf(n1) + " + " + String.valueOf(n2));
        l1.setBounds(30, 100, 70, 50);

        Answer = new TextField();
        Answer.setBounds(100, 100, 100, 50);

        Submit = new Button("Submit");
        Submit.setBounds(190, 100, 100, 50);

        Submit.addActionListener(this);

        setSize(400, 200);
        setVisible(true);
        setLayout(null);

        add(l1);
        add(Answer);
        add(Submit);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Submit) {
            int Answer = Integer.parseInt(Answer.getText());
            if ((n1 + n2) == Answer) {
                showStatus("Correct Addition.");
            } else {
                showStatus("Wrong Addition.");
            }
        }
    }
}
