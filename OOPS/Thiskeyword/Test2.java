class D
{
    int i;
    void m1(int i)
    {
        this.i=i;
        System.out.println(i);
        System.out.println(this.i);
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
        D d1=new D();
        d1.m1(10);
        d1.m2();
    }
}