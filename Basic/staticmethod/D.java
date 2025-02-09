class D
{
  public static void main(String[] args)
   {
     System.out.println("main of class D starts");
     E.main(null);
     System.out.println("main of class D ends");
   }
}
class E
{
  public static void main(String[] args)
   {
     System.out.println("main of class E starts");
     System.out.println("main of class E ends");
   }
}

     