import java.util.Scanner;
class Armstrong
{
    public static boolean isArmstrong(int n)
    {
        int count=0;
        int temp=n;
        while(n!=0)
        {
            n=n/10;
            count++;
            
        }
        System.out.println("Number of digit: "+count);
        n=temp;
        int sum=0;
        while(n!=0)
        {
           int prod=1;
           int r=n%10;
           for(int i=1;i<=count;i++)
           {
              prod=prod*r;
           }
           sum=sum+prod;
           n=n/10;
        }
        if(sum==temp)
        return true;
        else
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(isArmstrong(n));
    }
}