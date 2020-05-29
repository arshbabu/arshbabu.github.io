import java.util.Scanner;
class bata
{
 public static void main(String args[])
 {
  try
{]

  int b=Integer.parseInt(args[1]);
  int s=a+b;
  System.out.println("Add="+s);
  int x=a-b;
  System.out.println("sub="+x);
  int y=a/b;
  System.out.println("Div="+y);
  int z=a*b;
  System.out.println("Mult="+z);
}
catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e)
 {
  
   System.out.println(e);
 }   
System.out.println("Normal execution.....");


 }
}

