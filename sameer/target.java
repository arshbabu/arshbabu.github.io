//getting input from the user.
//import java.awt.*;
import java.applet.*;
public class target extends Applet
{
 String str;
 TextField t1,t2;
  public void init()   create an applet to find thye factorial of any number.
                       find the greater no in two number.
  {
   t1=new TextField(10);
   t2=new TextField(10);
   add(t1);
   add(t2);
  }
  public void paint(Graphics g)
  {
   int a,b,s;
    g.drawString("Enter value1",20,60);
    g.drawString("Enter value2",200,60);
    t1.setLocation(20,60);
    t2.setLocation(200,60);
     a=Integer.parseInt(t1.getText());
     b=Integer.parseInt(t2.getText());
     s=a+b;
     str=String.valueOf(s);
    g.drawString("Sum is="+str,80,150);
   }
  public boolean action(Event e,Object o)
  {
    repaint();
    return true;
  }
  
}
/*<applet code="target.class"
          width="400" 
          height="400">
   </applet>*/