class C
{
   C()
   {
    System.out.println("no arg cons");
   }
   C(int i)
   {
    System.out.println("1 arg cons"+i);
   }
   C(int i,int j)
   {
    System.out.println("2 arg cons"+i+","+j);
   }
   public static void main(String[] args)
   {
    C c=new C();
    C c1=new C(10);
    C c2=new C(20,30);
   }
}
