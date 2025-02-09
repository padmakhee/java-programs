class A 
{
    A()
    {
        System.out.println("A-Cons");
    }
}
class B extends A 
{
    B()
    {
        this(10);
        System.out.println("B-Cons");
    }
    B(int i)
    {
        System.out.println("B-int-Cons");
    }
}
class C extends B 
{
    C()
    {
        System.out.println("C-Cons");
    }
    C(int i)
    {
        System.out.println("C-int-Cons");
    }
}
public class Test2
{
    public static void main(String[] args)
    {
        new C();
        new C(10);
    }
}