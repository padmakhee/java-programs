// enter a num:
// 5
// 15
import java.util.Scanner;
class Summ
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a num:");
       int n=sc.nextInt();
       int sum=0;
       for(int i=1;i<=n;i++)
       {
        sum+=i;
       }
       System.out.println(sum);
    }
}