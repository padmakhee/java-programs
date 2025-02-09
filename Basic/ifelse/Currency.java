import java.util.Scanner;
class Currency
{
   public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter amount: ");
      int amt=sc.nextInt();
      if(amt>=2000)
      {
        System.out.println("2000X"+(amt/2000));
        amt %= 2000;
      }
      if(amt>=500)
      {
        System.out.println("500X"+(amt/500));
        amt %= 500;
      }
      if(amt>=200)
      {
        System.out.println("200X"+(amt/200));
        amt %= 200;
      }
      if(amt>=100)
      {
        System.out.println("100X"+(amt/100));
        amt %= 100;
      }
      if(amt>=50)
      {
        System.out.println("50X"+(amt/50));
       }
   }
}