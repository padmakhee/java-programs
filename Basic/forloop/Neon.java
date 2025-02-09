// Enter a number: 
// 9  (9*9)=81=8+1=9  9=9
// Neon Number
import java.util.Scanner;
class Neon
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int s=0;
        int sq=n*n;
        while(sq>0)
        {
            int r=sq%10;
            s=s+r;
            sq=sq/10;
        }
        if(s==n)
        System.out.println("Neon Number");
        else
        System.out.println("Not a Neon Number");
    }
}