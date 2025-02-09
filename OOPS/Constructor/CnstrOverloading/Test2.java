class Box
{
    int height;
    int width;
    int length;
    Box()
    {

    }
    Box(int h,int w,int l)
    {
       height=h;
       width=w;
       length=l;
    }
    Box(int d)
    {
        height=d;
        width=d;
        length=d;
    }
    void display()
    {
        System.out.println("["+height+","+width+","+length+"]");
    }
}
class Test2
{
    public static void main(String[] args)
    {
       Box b1=new Box();
       b1.display();
       Box b2=new Box(4,5,6);
       b2.display();
       Box b3=new Box(4);
       b3.display();
    }
}