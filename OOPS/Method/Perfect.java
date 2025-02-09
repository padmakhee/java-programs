import java.util.Scanner;
class Perfect
{
    public static boolean isPerfect(int n)
    {   
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            sum=sum+i;
        }
        if(sum==n)
        return true;
        else
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int n=sc.nextInt();
        isPerfect(n);
        System.out.print(isPerfect(n));
    }
}