import java.util.Scanner;
class EvenOdd
{
  public static void main(String[] args)
   { 
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a no:");
     int n=sc.nextInt();
     if(n%2==0)
     System.out.println(n+"is a even number");
     else
     System.out.println(n+"is a odd number");
    }
} 