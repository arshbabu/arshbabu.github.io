import java.util.Scanner;
import static java.lang.System.*;
class set
{
 
  public void disp1()thorws 
  {
   out.println("Disp1..");
   
  }
  
  public void disp2()
  {
   out.println("Disp2..");
   disp1();  
}

  public void disp3()
  {
     out.println("Disp3..");
   disp2(); 
}

  public void disp4()
  {
    out.println("Disp4..");
   disp3();  
}



public static void main(String args[])
 {
   set t=new set();
  try{ 
  t.disp4();}
 catch(Exception e)
  {
    out.println(e);
}
 
System.out.println("Normal flow of program");


}
}  
      
