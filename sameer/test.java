import java.util.*;
class test
{
 public static void main(String args[])
  {
  int a=0,b=0;   
    try
    {
          
      try{
            String s=null;
            s.length();
         }
      catch(NullPointerException e)
       {
       System.out.println(e);
       }
      finally
      { System.out.println("HELLO.....");}

     try{
     a=Integer.parseInt(args[0]);
     b=Integer.parseInt(args[1]);
       }
    catch(NumberFormatException e)
    {
     System.out.println(e);
      }
  finally{ System.out.println("bolo.....");}
      
    int x=a+b;
    System.out.println("Add ="+x);
  
    int y=a-b;
    System.out.println("Sub ="+y);
    
    int p=a*b;
    System.out.println("Mult ="+p);
    
    try
    {
    int z=a/b;
    System.out.println("Div="+z);
    }
    catch(ArithmeticException e)
     {
     System.out.println(e);
     }
    finally{ System.out.println("chalo.....");}    
    

  }  

  finally
   { 
   System.out.println("last finally..");
   }
    
  }
}