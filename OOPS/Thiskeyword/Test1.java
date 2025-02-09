class B
{
    int i;
    void m1()
    {
        int i=5;
        System.out.println(i);
        System.out.println(this.i);
    }
}
class Test1
{
   public static void main(String[] args)
   {
    B b1=new B();
    b1.i=10;
    B b2=new B();
    b2.i=20;
    b1.m1();
    b2.m1();
   }
}