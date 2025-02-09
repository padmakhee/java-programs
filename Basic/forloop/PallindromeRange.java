import java.util.Scanner;
class PallindromeRange
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number:");
        int st=sc.nextInt();
        System.out.println("Enter ending number:");
        int end=sc.nextInt();
        for(int i=st;i<=end;i++)
        {
            int n=i;
            int temp=i;
            int sum=0;
            while(n>0)
            {
                int r=n%10;
                sum=(sum*10)+r;
                n=n/10; 
            }
            if(temp==sum)
            System.out.println(i);
        }
    }
}