class AA 
{
    int i=10;
}
class BB extends AA
{
    int i=40;
    public void m2()
    {
        System.out.println(i);//30
        System.out.println(super.i);//10
    }
}
public class Test2
{
    public static void main(String[] args)
    {
        BB b=new BB();
        b.i=30;
        b.m2();// 30 10
    }
}