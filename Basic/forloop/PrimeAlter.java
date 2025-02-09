import java.util.Scanner;
class PrimeAlter 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n<=1)
        {
            System.out.println("Not a Prime Number");
        }
        else
        {
            boolean flag=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
            }
        }
        if(flag)
        System.out.println("Prime Number");
        else 
        System.out.println("Not a Prime Number");
        }
    }
}