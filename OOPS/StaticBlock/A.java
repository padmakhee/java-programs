class A
{
   static
   {
    System.out.println("Static-Block-1");
   }
   public static void main(String[] args)
   {
    System.out.println("Main starts");
    System.out.println("Main ends");
   }
   static
   {
       System.out.println("Static-Block-2");
   }
}