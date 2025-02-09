//package pack_1;
class A
{
    int i=10;
    void m1()
    {
        System.out.println("M1-A");
    }
}
class B extends A 
{
    int j=20;
    void m2()
    {
        System.out.println("M2-B");
    }
}
class C extends B 
{
    int k=30;
    void m3()
    {
        System.out.println("M3-C");
    }
}
public class Demo 
{
    public static void main(String[] args)
    {
        A a=new A();
        System.out.println(a.i);
        //System.out.println(a.j);//CTE
        //System.out.println(a.k);//CTE
        a.m1();
        //a.m2();//CTE
        //a.m3();//CTE
        B b=new B();
        System.out.println(b.i);
        System.out.println(b.j);
        //System.out.println(b.k);//CTE
        b.m1();
        b.m2();
        //a.m3();//CTE
        C c=new C();
        System.out.println(c.i);
        System.out.println(c.j);
        System.out.println(c.k);
        c.m1();
        c.m2();
        c.m3();
    }
}