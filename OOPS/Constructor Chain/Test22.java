class A 
{
    A()
    {
        this(10);
        System.out.println("No-args");
    }
    A(int i)
    {
        System.out.println(i);
        System.out.println("one-arg");
    }
}
class Test22
{
    public static void main(String[] args)
    {
        A a=new A();
    }
}
