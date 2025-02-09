import java.util.Scanner;
class Aaa
{
    public static void main(String[] args)
    {
        System.out.println("Enter a num: ");
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int j=0;
        for(int i=1;i<=n;i++)
        {
            j=i;
        }
        System.out.print(j);
    }
}