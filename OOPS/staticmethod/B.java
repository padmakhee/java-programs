class B
{
  public static void m1()
   {
     System.out.println("m1 starts");
     B.m2();
     System.out.println("m1 ends");
   }
  public static void m2()
   {
     System.out.println("m2 starts");
     System.out.println("m2 ends");
   }
  public static void main(String[] args)
   {
     System.out.println("main method starts");
     B.m1();
     System.out.println("main method ends");
   }
}

