class thapa extends Thread
 {
   public void run()
   {
    for(int i=1;i<=5;i++){
     System.out.println(Thread.currentThread().getName());
    try{
       Thread.sleep(5000);
       }
       catch(InterruptedException e){
       e.printStackTrace();}
    }
  }   
 } 
class tata
{
 public static void main(String args[])
  {
  System.out.println(Thread.currentThread().getName());  
   thapa t=new thapa();
   t.setName("1st"); 
   t.start();
   thapa t1=new thapa();
   t1.setName("2st"); 
   t1.start();
      
 }
}
          