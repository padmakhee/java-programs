// Enter a number: 6 divisor=1,2,3,6(1+2+3=6) or 28(1,2,4,7,14,28)1+2+4+7+14=28
// Perfect Number
import java.util.Scanner;
class Perfect
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            sum=sum+i;
        }
        if(sum==n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}