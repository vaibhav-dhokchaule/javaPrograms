import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Ehsampleb extends JFrame implements ActionListener
{
JTextField jtf;
JRadioButton jrb1,jrb2;
ButtonGroup bg;
public Ehsampleb()
{
setLayout(new FlowLayout());
bg=new ButtonGroup();
jrb1=new JRadioButton("A");
jrb1.addActionListener(this);
bg.add(jrb1);
add(jrb1);
jrb2=new JRadioButton("B");
jrb2.addActionListener(this);
bg.add(jrb2);
add(jrb2);
jtf=new JTextField(5);
add(jtf);
setSize(200,200);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{
jtf.setText(ae.getActionCommand());
}
public static void main(String args[]){
new Ehsampleb();
}
}
