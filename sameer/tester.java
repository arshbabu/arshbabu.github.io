import java.util.Scanner;
import static java.lang.System.*;
class tester
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(in);
   out.println("Enter your age");
   int age=sc.nextInt();
   
     if(age<18)
     {
        try
          {
            throw  new NullPointerException(" Age Not VAlid"); 
     
          }
          catch(Exception e)
          {
           System.out.println(e);
          }
    }  
  else
    out.println("Valid");
   
   out.println("NORMAL FLOW OF PROGRAM....");   
 }
}