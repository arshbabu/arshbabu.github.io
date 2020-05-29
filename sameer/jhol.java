import java.awt.*;
import java.applet.*;
public class jhol extends Applet
{
  String str;
 int a,b,s;

  public void init()
  {
    a=10;
    b=20;
    s=a+b;
   str=String.valueOf(s);
  }
  public void paint(Graphics g)
  {
   g.setFont(Font.BOLD);
   g.setColor(Color.green);
   g.drawString("Sum is ="+str,50,50);
  }
}

