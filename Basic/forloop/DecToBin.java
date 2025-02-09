import java.util.Scanner;
class DecToBin
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal Number: ");
        int n=sc.nextInt();

        int binary=0;
        int i=1;
        while(n>0)
        {
            int bit=n%2;
            binary = bit*i + binary;
            i*=10;
            n/=2;
        }
        System.out.println("bin="+binary);
    }
}