import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int a=sc.nextInt();
        System.out.println("Enter next number: ");
        int b=sc.nextInt();
        System.out.println("Enter number till when you need to print fibonacci series: ");
        int n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=a;i<=n;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}