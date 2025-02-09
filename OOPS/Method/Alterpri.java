import java.util.Scanner;
class Alterpri
{
    public static boolean isPrime(int n)
    {
        if(n<=1)
        return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void range(int st,int end)
    {
        int count=0;
        for(int i=st;i<=end;i++)
        {
            if(isPrime(i))
            {
                count++;
                if(count%2!=0)
                {
                System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter starting number: ");
        int st=sc.nextInt();
        System.out.print("Enter ending number:");
        int end=sc.nextInt();
        range(st,end);
    }
}