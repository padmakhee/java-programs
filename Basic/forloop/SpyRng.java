import java.util.Scanner;
class SpyRng
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number:");
        int st=sc.nextInt();
        System.out.print("Enter ending number:");
        int end=sc.nextInt();
        for(int i=st;i<=end;i++)
        {
            int sum=0;
            int prod=1;
            int n=i;
            while(n>0)
            {
            int r=n%10;
            sum=sum+r;
            prod=prod*r;
            n=n/10;
            }
            if(sum==prod)
                System.out.println(i);

        }
    }
}