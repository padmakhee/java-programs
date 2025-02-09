class calc
{
    static void add(int a,int b)
    {
        System.out.print(a+b);
    }
}
class Num
{
   int a;
   int b;
   void add()
   {
    System.out.print(a+b);
   }

public static void main(String[] args)
{
   Num n1=new Num();
   n1.a=10;
   n1.b=20;
   Num n2=new Num();
   n1.a=30;
   n1.b=40;
   n1.add();
   n2.add();
}
}
