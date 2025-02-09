import java.util.Scanner;
class NeonRange
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number:");
        int st=sc.nextInt();
        System.out.println("Enter ending number:");
        int end=sc.nextInt();
        for(int i=st;i<=end;i++)
        {
            int n=i;
            int s=0;
            int sq=n*n;
            while(sq>0)
            {
            int r=sq%10;
            s=s+r;
            sq=sq/10;
            }
            if(s==n)
                System.out.println(i);
        }
    }
}