class Bike
{
    String color;
    Bike(String c)
    {
        color=c;
    }
}
class Garage
{
    void changeColor(Bike b)
    {
        b.color="black";
        System.out.println("bike color changed to black");
    }
}
class Test22
{
    public static void main(String[] args)
    {
        Bike b1=new Bike("red");
        System.out.println(b1.color);
        Garage g=new Garage();
        g.changeColor(b1);
        System.out.println(b1.color);
    }
}