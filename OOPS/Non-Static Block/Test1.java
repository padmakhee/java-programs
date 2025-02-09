class A 
{
    static
    {
        System.out.println("Static-Block-A");
    }
    {
        System.out.println("Non-Static-Block-A");
    }
    A()
    {
        System.out.println("cons-A");
    }
}
class B extends A 
{
    static
    {
       System.out.println("static-Block-B"); 
    }
    {
        System.out.println("Non-static-Block-B");
    }
    B()
    {
        System.out.println("Cons-B");
    }
}
public class Test1
{
    public static void main(String[] args)
    {
        new B();
    }
}