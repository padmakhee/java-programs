class D
{
    static
    {
        System.out.println("Static-Block-1");
    }
    {
        System.out.println("Non-Static Block-1");
    }
    D()
    {
        System.out.println("D-cons");
    }
    public static void main(String[] args)
    {
        System.out.println("Main starts");
        D d=new D();
        System.out.println("Main ends");
    }
    {
        System.out.println("Non-Static Block-2");
    }
    static
    {
        System.out.println("Static Block-2");
        new D();
    }
}