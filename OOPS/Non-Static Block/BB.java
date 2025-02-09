class BB
{
    static
    {
        System.out.println("Static-1");
    }
    {
        System.out.println("Non-Static-1");
    }
    BB()
    {
        System.out.println("B-cons");
    }
    public static void main(String[] args)
    {
        System.out.println("Main starts");
        BB b1=new BB();
        System.out.println("Main ends");
    }
    {
        System.out.println("Non-static-2");
    }
    static 
    {
        System.out.println("Static-2");
        new BB();
    }
}