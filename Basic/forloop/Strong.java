import java.util.Scanner;
class Strong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=0;
        int sum=0;
        int temp=n;
        int r;
        while(n>0)
        {
            r=n%10;
            int fact=1;
        for(int i=1;i<=r;i++)
        {
            fact=fact*i;
        }
        
        sum=sum+fact;
        n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("Strong number");
        }
        else
        {
            System.out.println("not a Strong number");
        }
    }
}