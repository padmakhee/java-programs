class A
{
    int i;
    A(int i)
    {
        this.i=i;
    }
}
class B
{
    void m1(A arg)
    {
        System.out.println(arg.i);
    }
}
class Test1
{
    public static void main(String[] args)
    {
        A a1=new A(10);
        A a2=new A(20);
        B b1=new B();
        b1.m1(a1);
        b1.m1(a2);
        b1.m1(new A(30));
    }
}