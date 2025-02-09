class Test
{
    int i;
    public void m1()
    {
        Test t=new Test();
        t.i=40;
        System.out.println(i);
        System.out.println(this.i);
    }
    public static void main(String[] args)
    {
        Test t=new Test();
        t.i=80;
        t.m1();
    }
}