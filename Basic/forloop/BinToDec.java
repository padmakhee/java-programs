import java.util.Scanner;
class BinToDec
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary: ");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(n>0)
        {
            sum=sum+(n%10) * i;
            i=i*2;
            n=n/10;
        }
        System.out.println(sum);
    }
}