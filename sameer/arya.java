import java.awt.*;
import java.applet.*;
public class arya extends Applet
{
  String str;
   TextField t1,t2;
  public void init()
  {
     t1=new TextField(10);
     //t2=new TextField(10);
     add(t1);
     //add(t2);
  }
 
 public void paint(Graphics g)
 {
   int a,b,s,f=1;
   g.drawString("Enter any Number",20,60);
   //g.drawString("Enter 2nd Number",200,60);
   t1.setLocation(20,60);
   //t2.setLocation(200,60);
   a=Integer.parseInt(t1.getText());
   //b=Integer.parseInt(t2.getText());
   //s=a+b;
   for(int i=1;i<=a;i++)
    f=f*i;
   str=String.valueOf(f);
   g.drawString("Sum is ="+str,80,150);
  }
  public boolean action(Event e,Object o)
  {
   repaint();
   return true;
  }

}
//<applet code="arya.class" width="500" height="500"></applet> 
