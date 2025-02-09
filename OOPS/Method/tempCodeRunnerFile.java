import java.util.Scanner;
class Prime
{
    public static boolean isPrime(int n)
    {
        if(n<1)
        return false;
        if(n==1)
        return true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void range(int st,int end)
    {
        int n;
        for(int i=st;i<=end;i++)
        {
        if(isPri(i))
        System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter st range.:");
        int st=sc.nextInt();
        System.out.print("Eneter ending range.:");
        int end=sc.nextInt();
        range(st,end);
    }
}