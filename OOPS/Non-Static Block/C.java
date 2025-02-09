class C
{
   {
    System.out.println("Non-Static Block-1");
   }
   C()
   {
    System.out.println("C-cons");
   }
   public static void main(String[] args)
   {
    System.out.println("Main Starts");
    new C();
    new C(10);
    System.out.println("Main ends");
   }
   C(int i)
   {
    System.out.println("C-cons-int");
   }
   {
    System.out.println("Non-Static Block-2");
   }
}