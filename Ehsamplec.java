import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Ehsamplec extends JFrame
{
JLable l=new JLabel();
Ehsamplec()
{
setLayout(new FlowLayout());
add(l);
addKeyListner(new KeyAdapter());
{
public void KeyTyped(KeyEvent ke)
{
l.setText("you typed"+ke.getKeyChar());
});
addMouseMotionListener(new MouseMotionAdapter()
{
public void mouseMoved(MouseEvent me)
{
l.setText("Mouse moved:X="+ me.getX()+"Y="+me.getY());
}
});
setSize(200,200);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
new Ehsamplec();
}
}


