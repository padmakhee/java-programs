class B
{
    int i;
    int j;
    B()
    {
        i=10;
    }
    B(int arg)
    {
        this();
        j=arg;
    }
}
class Test2
{
    public static void main(String[] args)
    {
        B b1=new B(20);
        System.out.println(b1.i);
        System.out.println(b1.j);
    }
}