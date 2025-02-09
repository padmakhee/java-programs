import java.util.Scanner;
class AddString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s1=sc.nextLine();
        System.out.println("Enter second String: ");
        String s2=sc.nextLine();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        System.out.println(n1+n2);
    }
}