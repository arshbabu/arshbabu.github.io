static class porter
{
  public void disp()
  {
    System.out.println("I am Base class");
   }
};
class wel extends porter
{
 public void disp()
 {
   System.out.println("I am Child class"); 
 }
};
class port
{
  public static void main(String args[])
  {
   wel t=new wel();
  t.disp();
  }
}

  