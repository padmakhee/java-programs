class Rectangle
{
    int length;
    int breadth;
    void initialization(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void area()
    {
       int res=length*breadth;
       System.out.println(res);
    }
    void perimeter()
    {
       int peri=2*(length+breadth);
       System.out.println(peri);
    }
    void display()
    {
        System.out.println(length);
        System.out.println(breadth);
    }
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle();
        r.initialization(10,5);
        r.area();
        r.perimeter();
        r.display();
        System.out.println("==============");
        Rectangle r2=new Rectangle();
        r2.initialization(5,3);
        r2.area();
        r2.perimeter();
        r2.display();
    }
}