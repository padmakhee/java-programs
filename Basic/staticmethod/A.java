//How to call a static method
class A
{
  public static void m1()
   {
     System.out.println("Hello");
    }
   public static void main(String[] args)
    {
      System.out.println("Harry");
      A.m1(); //classname.method();
    }
}
     