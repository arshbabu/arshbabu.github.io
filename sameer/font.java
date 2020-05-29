import java.awt.*;
import java.applet.*;
public class font extends Applet
{
  Font t=new Font("Arial",Font.ITALIC,20);
  Color t1=new Color(50,200,30);
  public void paint(Graphics g)
  {
     g.setFont(t);
     g.setColor(t1);     
     g.drawString("DARBAR.COM",20,60);
     g.setColor(Color.red);
     g.drawString("Font details"+g.getFont(),40,100);
  }
}
/*<applet code="font.class" height="250"
           width="250">
  </applet>
*/