import java.util.Scanner;
class PerfectRange
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number:");
        int st=sc.nextInt();
        System.out.println("Enter ending number:");
        int end=sc.nextInt();
        for(int j=st;j<=end;j++)
        {
            int n=j;
            int sum=0;
            for(int i=1;i<=n/2;i++)
            {
                if(n%i==0)
                sum=sum+i;
            }
            if(sum==j)
                System.out.println(j);
        
        }
    }
}