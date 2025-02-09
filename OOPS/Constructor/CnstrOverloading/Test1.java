class E
{
   E()
   {
    System.out.println("Default constructor");
   }
   E(int i)
   {
    System.out.println("1 int arg cons");
   }
}
class Test1
{
    public static void main(String[] args)
    {
        new E();
        new E(10);
    }
}
