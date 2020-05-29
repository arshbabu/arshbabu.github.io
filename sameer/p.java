import java.awt.*;
import java.applet.Applet;
public class p extends Applet
{
  
  Font f=new Font("New Times Roman",Font.BOLD,40);  
  
  public void paint(Graphics g)
   {
    setFont(f);
    g.drawString("DARBAR.COM",50,80);
     Font t=new Font("serif",Font.ITALIC,20); 
    setFont(t);
    g.drawString("HAJIPUR",400,200);
   }
}
