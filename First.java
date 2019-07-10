import java.awt.*;
import java.awt.event.*;
class First extends Frame implements ActionListener
{
Button b1;
TextField t1,t2;
TextArea t3;
Label l1,l2;
First()
{
b1=new Button ("ok");
t1=new TextField(15);
t1=new TextField(15);
t3=new TextArea(20,20);
l1=new Label("Name");
l2=new Label("FavActor");
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
setLayout(new FlowLayout());
setSize(300,300);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
t3=append("Your Name is:"+t1.getText());
t3=append("Your FavActor is:"+t2.getText());
}
public static void main(String args[])
{
First f=new Frame();
}
}

