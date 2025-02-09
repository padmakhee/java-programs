import java.util.Scanner;
class Ne
{
    public static boolean isNeon(int n) 
    {
        int s=0;
        int sq=n*n;
        while(sq>0)
        {
            int r=sq%10;
            s=s+r;
            sq=sq/10;
        }
        if(s==n)
        return true;
        else
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int n=sc.nextInt();
        System.out.print(isNeon(n));
    }
}