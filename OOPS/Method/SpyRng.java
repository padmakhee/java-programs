import java.util.Scanner;
class SpyRng
{
    public static boolean isSpy(int n)
    {
        int sum=0;
        int prod=1;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            prod=prod*r;
            n=n/10;
        }
        if(sum==prod)
        return true;
        else
        return false;
    }
    public static void range(int st,int end)
    {
        for(int i=st;i<=end;i++)
        {
            if(isSpy(i))
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
        System.out.print("Enter ending number: ");
        int st=sc.nextInt();
        
    }
}