class C
{
    int i;
    int j;
    C()
    {
        i=10;
        System.out.println(i);
    }
    C(int arg)
    {
        this(30,40);
        j=arg;
        System.out.println(j);
    }
    C(int i,int arg)
    {
        this();
        this.i=i;
        j=arg;
        System.out.println(i);
        System.out.println(j);
    }
}
class Test4
{
    public static void main(String[] args)
    {
        C c=new C(30,40);
       // System.out.println(c.i);
        //System.out.println(c.j);
        C c1=new C(20);

    }
}