import java.util.Scanner;
class Odd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number:");
        int s=sc.nextInt();
        System.out.print("Enter ending number:");
        int e=sc.nextInt();
        for(int i=s;i<=e;i++)
        {  
            if(i%2==1)
           System.out.println(i);
        }
    }
}