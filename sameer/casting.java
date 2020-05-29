class casting
{
 public static void disp(byte b)
 {
   System.out.println("Byte="+b);
 }
 public static void disp(short s)
 {
   System.out.println("short="+s);
 } 
 
 public static void disp(int i)
 {
   System.out.println("int="+i);
 }
 public static void disp(long l)
 {
   System.out.println("long="+l);
 }
 public static void disp(float f)
 {
   System.out.println("float="+f);
 }
 public static void disp(Double d)
 {
   System.out.println("Double="+d);
 }
public static void main(String args[])
 {
  
  byte a=10;
  byte b=20;
  byte s=(byte)a+(byte)b;

System.out.println(s);
 
 }
} 