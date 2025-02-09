class A
{
    A()
    {
        System.out.println("Implementation in default cons.");
    }
    A(int i)
    {
        this(); //call to zero-args cons
        System.out.println("Implementation in parameter cons.");
    }
}
class Test
{
    public static void main(String[] args)
    {
        new A(3);
    }
}