import java.util.Scanner;
class Prime 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=0;
        if(n<=1)
        {
        count++;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        System.out.println("Prime Number");
        else 
        System.out.println("Not a Prime Number");
    }
}