import java.util.Scanner;
class NeonRng
{
    public static boolean isNeon(int n)
    {
        int sq=n*n;
        int sum=0;
        while(sq>0)
        {
            int r=sq%10;
            sum=sum+r;
            sq=sq/10;
        }
        if(n==sum)
        return true;
        else
        return false;
    }
    public static void range(int st,int end)
    {
        for(int i=st;i<=end;i++)
        {
            if(isNeon(i))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int st=sc.nextInt();
        System.out.print("Enter starting number: ");
        int end=sc.nextInt();
        range(st,end);
    }
}