class B
{
    B(int i)
    {
        System.out.println("B-cons");
        System.out.println(i);
    }
    public static void main(String[] args)
    {
        B b1=new B(10);
        B b2=new B(20);
        B b3=new B(10-5);
        //B b4=new B();
    }
}