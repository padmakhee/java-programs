import java.util.Scanner;
class AddNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        char ch1=sc.next().charAt(0);
        System.out.println("Enter Second number: ");
        char ch2=sc.next().charAt(0);
        System.out.println((ch1-'0')+(ch2-'0'));
    }
}