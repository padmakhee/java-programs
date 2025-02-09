class B
{
   B()
   {
    System.out.println("no arg cons");
   }
   B(int i)
   {
    System.out.println("1 arg cons"+i);
   }
   B(int i,int j)
   {
    System.out.println("2 arg cons"+i+","+j);
   }
   public static void main(String[] args)
   {
    B b=new B();
    B b1=new B(10);
    B b2=new B(20,30);
   }
}
