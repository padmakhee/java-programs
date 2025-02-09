import java.util.Scanner;
class Spy
{
    public static boolean isSpy(int n)
    {
        int prod=1;
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r;
            prod=prod*r;
            n=n/10;
        }
        if(sum==prod)
        return true;
        else
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print(isSpy(n));
    }
}