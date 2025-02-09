class B
{
    int i;
    int j;
    B(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
    B(B b)
    {
        this.i=b.i;
        this.j=b.j;
    }
    void display()
    {
        System.out.println(i+","+j);
    }
}
class Test
{
    public static void main(String[] args)
    {
        B b1=new B(10,20);
        B b2=new B(b1);
        b1.display();
        b2.display();
    }
}
