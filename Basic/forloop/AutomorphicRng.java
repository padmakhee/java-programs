import java.util.Scanner;
class AutomorphicRng
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
            int sq=n*n;
            boolean flag=true;
            while(n>0)
            {
                if(sq%10 != n%10)
                {
                    flag=false;
                    break;
                }
                n=n/10;
                sq=sq/10;
            }
            if(flag)
                System.out.println(i);
        }
    }
}   