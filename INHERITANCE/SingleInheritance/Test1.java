class A 
{
    A(int i)
    {
        System.out.println("A-cons");
    }
}
class B extends A 
{
    B()
    {
        super(10);
        System.out.println("B-cons");
    }
}
public class Test1
{
    public static void main(String[] args)
    {
        new B();
    }
}