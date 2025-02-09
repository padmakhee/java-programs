import java.util.Scanner;
class Length
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int len=(num+"").length();
        System.out.println(len);
    }
}