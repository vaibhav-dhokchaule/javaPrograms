import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Ehsamplea extends JFrame implements ItemListener
{
JTextField jtf;
JCheckBox jcb1,jcb2;
public Ehsamplea()
{
setLayout(new FlowLayout());
jcb1=new JCheckBox("vaibhav dhokchaule");
jcb1.addItemListener(this);
add(jcb1);
jcb2=new JCheckBox("uddesh bhingarde");
jcb2.addItemListener(this);
add(jcb2);
jtf=new JTextField(35);
add(jtf);
setSize(200,200);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void itemStateChanged(ItemEvent ie)
{
String text="";
if(jcb1.isSelected())
text=text+jcb1.getText()+"";
if(jcb2.isSelected())
text=text+jcb2.getText();
jtf.setText(text);
}
public static void main(String args[]){
new Ehsamplea();
}
}

