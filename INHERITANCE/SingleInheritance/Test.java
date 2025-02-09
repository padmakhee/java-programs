class AA
{
    static 
    {
        System.out.println("Static-Block-A");
    }
}
class BB extends AA
{
    static
    {
        System.out.println("Static-Block-B");
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
        System.out.println("Main Starts");
        BB b=new BB();
        System.out.println("Main ends");
    }
}