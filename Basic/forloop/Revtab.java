import java.util.Scanner;
class Revtab
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table number:");
        int n=sc.nextInt();
        for(int i=10;i>=1;i--)
        {  
           System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}