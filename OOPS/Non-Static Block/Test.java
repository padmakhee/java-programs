class A 
{
    {
        System.out.println("Non-static-Block-A");
    }
    static
    {
        System.out.println("Static-Block-A");
    }
    A()
    {
       System.out.println("A-cons"); 
    }
}
class B extends A 
{
{
    System.out.println("Non-static-Block-B");  
}
static
{
    new A();
    System.out.println("Static-Block-B");  
}
B()
{
    System.out.println("B-cons");
}
}
public class Test
{
    static 
    {
        System.out.println("Static-Block-Test");  
    }
    public static void main(String[] args)
    {
       System.out.println("Main starts"); 
       new B();
       System.out.println("Main ends"); 
    }
}