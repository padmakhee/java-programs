class Car
{
    String carName;
    String carColor;
    double carPrice;
    int carNum;
}
class carDriver
{
    public static void main(String[] args)
    {
        Car c1=new Car();
        c1.carName="BMW";
        c1.carColor="Black";
        c1.carPrice=9000000;
        c1.carNum=1111;
        System.out.println(c1.carName+"\n"+c1.carColor+"\n"+c1.carPrice+"\n"+c1.carNum);
        System.out.println("================");

        Car c2=new Car();
        c2.carName="AUDI";
        c2.carColor="White";
        c2.carPrice=56000000;
        c2.carNum=1112;
        System.out.println(c2.carName+"\n"+c2.carColor+"\n"+c2.carPrice+"\n"+c2.carNum);    
    }
}