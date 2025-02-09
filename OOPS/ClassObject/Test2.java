class C
{
    int i;
    static void m1()
    {
        System.out.println(i);
    }
    void m2()
    {
        System.out.println(i);
    }
}
class Test2
{
    public static void main(String[] args)
    {
        C c1=new C();
        c1.i=10;
        C c2=new C();
        c2.i=20;
        //C c3=new C();
        //c3.i=30;
        C.m1();
        c1.m2();
        c2.m2();
        //c3.m2();
    }
}
