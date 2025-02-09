class D
{
   int i;
   D(int a)
   {
    i=a;
   }
   public static void main(String[] args)
   {
    D d1=new D(10);
    D d2=new D(20);
    new D(30);
    System.out.println(d1.i);
    System.out.println(d2.i);
    System.out.println(new D(30).i);
   }
}