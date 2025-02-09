class B
{
    static int i;
    static void m1()
    {
        System.out.println(i);
    }
    void m2()
    {
        System.out.println(i);
    }
}
class Test1
{
    public static void main(String[] args)
    {
        B.i=10;
        B.m1();
        B b1=new B();
        b1.m2();
        B b2=new B();
        b2.m2();
    }
}