class AA
{
    int i=10;
}
class BB extends AA{
    int i=20;
    public void m2()
    {
        System.out.println(i);
        System.out.println(super.i);
    }
}
class CC extends BB
{
    int i=30;
    public void m3()
    {
        m2();
        System.out.println(i);
        System.out.println(super.i);
    }
}
public class Test
{
    public static void main(String[] args)
    {
        CC c=new CC();
        c.m3();
    }
}