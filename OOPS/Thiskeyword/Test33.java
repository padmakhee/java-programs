class E
{
    int i;
    void m1()
    {
        int i=10;
        E e1=new E();
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(e1.i);
    }
}
class Test33
{
    public static void main(String[] args)
    {
        E e1=new E();
        e1.i=20;
        e1.m1();
    }
}