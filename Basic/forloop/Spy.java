// Enter a number: 
// 132=1+3+2=6 or 1*3*2=6   6=6
// Spy Number
import java.util.Scanner;
class Spy
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        int prod=1;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r;
            prod=prod*r;
            n=n/10;
        }
        if(sum==prod)
        System.out.println("Spy Number");
        else
        System.out.println("Not a Spy Number");
    }
}