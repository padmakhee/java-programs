import java.util.Scanner;
class Highperfect
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
    public static void range(int st,int end)
    {
        for(int i=end;i>=st;i--)
        {
            if(isPerfect(i))
            {
            System.out.print(i);
            break;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int st=sc.nextInt();
        System.out.print("Enter ending number: ");
        int end=sc.nextInt();
        range(st,end);
    }
}