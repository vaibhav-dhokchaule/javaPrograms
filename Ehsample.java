import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Ehsample extends JFrame implements ActionListener
{
JTextField jtf;
JButton jb;
public Ehsample()
{
setLayout(new FlowLayout());
jtf=new JTextField(15);
add(jtf);
jb=new JButton("Click Me");
jb.addActionListener (this);
add(jb);
setSize(200,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
jtf.setText("Welcome");
}
public static void main(String args[]){
new Ehsample();
}
}
