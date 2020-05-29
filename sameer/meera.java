/*note
   1 static method:- static method either execute by an object
                    or without creating object
             public static void disp()
             {
             }
           direct calling without creating of any object
              disp();
   2 static block recomended by java
     this block is executed before main() method
   3 a class does not close by semicolor
        class tata
        {
          
        } 
   4 creating an object of any class by new keyword in java
        tata t=new tata();
*/      
class meera
{
 
 public  static void disp()//static method 
 {
   System.out.println("HELLO HOW R U");
 }
 
 static //static block 
  {
    System.out.println("THIS IS A Static Block");
  }

 public static void main(String args[])
 {
  System.out.println("I am  a main method");
  disp(); 

 }
}    