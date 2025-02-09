import java.util.Scanner;
class Fibonacii
{
    public static void main(String[] args)
    {
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int r=sc.nextInt();
        System.out.print(a+"\t"+b+"\t");
        for(;;)
        {
            int c=a+b;
            if(c>=r)
            break;
            System.out.print(c+"\t");
            a=b;
            b=c;
        }
    }
}