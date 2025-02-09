class C 
{
    int i;
    C(int i)
    {
        this.i=i;
    }
    void m1(C arg)
    {
        System.out.println(i);
        System.out.println(arg.i);
        System.out.println(this.i);
    }
}
class Test3
{
    public static void main(String[] args)
    {
        C c1=new C(10);
        C c2=new C(20);
        c1.m1(c2);
        c2.m1(c1);
    }
}