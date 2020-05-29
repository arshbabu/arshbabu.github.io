class tester
{   
   public static void disp()
   {
   	System.out.println("I am DISP Method");
   }   

	public static void main(String[] args)
	{
      System.out.println("main method area");		
 // tester t=new tester();
  // t.disp();//static method disp() called by object
	   
   disp();//static method disp() called by without object
	}
	
	static 
	{
		System.out.println("Static area");
	}

}
/* 1 public:-  it is a keyword 
   and access modifier to accesible/visible any where in your code
   2 static:- it is a keyword 
      1 static variable:-
      when variable declare static i.e called static variable
      or class variable. 
      eg static int n;
      2 static method:-when method is declare static i.e
       called static method/class method
      eg static void disp()
         {
	      static method call by  either an object
	       or without an object
         }
      3 static block:-it contens the block without any name 
       i.e called static block
        eg
             static
             {
	          this block is executed before loading
	          the main method. 
             }

 */








