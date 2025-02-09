class A 
{
    {
        System.out.println("Non-static-Block-1");
    }
    A()
    {
        System.out.println("Cons-A");
    }
    A(int i)
    {
        System.out.println("Cons-A-int");
    }
    public static void main(String[] args)
    {
        System.out.println("Main starts");
        new A();
        new A(10);
        System.out.println("Main ends");
    }
    {
        System.out.println("Non-static-Block-2");
    }
}