class D
{
    int i=10;
    void m1(int a)
    {
        
        System.out.println(a);
        System.out.println(i);
    }
    void m2()
    {
        System.out.println(i);
    }
}
class Test3
{
    public static void main(String[] args)
    {
        D d1=new D();
        d1.m1(5);
        d1.m2();
    }
}