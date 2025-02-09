import java.util.Scanner;
class LCM

{
  public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter first number:");
      int n1=sc.nextInt();
      System.out.println("enter second number:");
      int n2=sc.nextInt();
      int a=(n1>n2) ? n1 : n2;
      while(true)
      {
          if(a%n1==0 && a%n2==0)
           {
	            System.out.println("LCM of entered two number is:"+a);
              break; 
           }
          a++;
       }
    }
} 