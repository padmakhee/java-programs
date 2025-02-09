import java.util.Scanner;
class Pri2
{
    public static boolean isPri(int n)
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
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        if(isPri(n))
        {
            System.out.println(n+" is a primeno.");
        }
        else
        {
            System.out.println(n+" is not a primeno.");
        }
    }
}
