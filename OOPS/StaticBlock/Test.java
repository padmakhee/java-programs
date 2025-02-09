class Test
{
    static int a;
    int b;
    static
    {
       a=10;
       //b=20;//CTE(non-static variable b cannot be referenced from a static context)
    }
    {
        a=30;
        b=40;
    }
    public static void main(String[] args)
    {
        System.out.println(a);//10
        Test t=new Test();
        System.out.println(a);//30
        System.out.println(t.b);//40
    }
    {
        System.out.println("Main starts");
    }
}