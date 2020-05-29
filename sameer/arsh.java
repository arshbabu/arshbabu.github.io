class arshu extends Thread 
{
   public void run()
   { 
   System.out.println(Thread.currentThread().getName());
    System.out.println("Priority="+getPriority());
    for(int i=1;i<=5;i++)  
    {
      System.out.println(i);
      try{
        Thread.sleep(2000);
       }
       catch(Exception e )
        {}       
 arshu t2=new arshu();
             
    }
  }
}
class arsh
{
public static void main(String args[])
 {
  System.out.println(Thread.currentThread().getName());
  arshu t1=new arshu();
  t1.setName("T1");
  t1.setPriority(10);
  t1.start();  
  try{
        Thread.sleep(2000);
       }
       catch(Exception e )
        {}       
 arshu t2=new arshu();
  t2.setName("T2");
  t2.setPriority(2); 
 t2.start();
 
 }
}  