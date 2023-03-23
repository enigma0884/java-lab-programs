import javax.swing.*;
import java.awt.event.*;

class StringOP implements ActionListener {
  JTextField tf1, tf2;
  JButton b1, b2, b3, b4;
  JLabel l1, l2;

  StringOP() {
    JFrame f = new JFrame();

    tf1 = new JTextField();
    tf1.setBounds(80, 80, 150, 20);

    tf2 = new JTextField();
    tf2.setBounds(80, 130, 200, 20);
    tf2.setEditable(false);

    l1 = new JLabel("Enter text");
    l1.setBounds(50, 50, 100, 30);

    l2 = new JLabel("Result");
    l2.setBounds(50, 100, 100, 30);

    b1 = new JButton("Find mid character");
    b1.setBounds(50, 200, 250, 50);

    b2 = new JButton("Check palindrome");
    b2.setBounds(320, 200, 250, 50);

    b3 = new JButton("Count vowels");
    b3.setBounds(50, 300, 250, 50);

    b4 = new JButton("Find length");
    b4.setBounds(300, 200, 250, 50);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);

    f.add(tf1);
    f.add(tf2);
    f.add(l1);
    f.add(l2);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);

    f.setSize(650, 450);
    // f.setLayout(null);
    f.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String s = tf1.getText();
    int len = s.length();
  }
}

public class B6 {
  public static void main(String[] args) {
    new StringOP();
  }
}