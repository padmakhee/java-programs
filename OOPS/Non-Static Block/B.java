class B
{
    {
        System.out.println("Non-static Block-1");
    }
    public static void main(String[] args)
    {
        System.out.println("Main starts");
        B b1=new B();
        B b2=new B();
        System.out.println("Main ends");
    }
    {
    System.out.println("Non-Static Block-2");
    }
}