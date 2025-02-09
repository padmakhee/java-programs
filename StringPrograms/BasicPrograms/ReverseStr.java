import java.util.Scanner;
class ReverseStr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        String S="";
        for(int i=s.length()-1;i>=0;i--)
        {
            // System.out.print(s.charAt(i));
            S+=s.charAt(i);
        }
        System.out.print(S);
    }
}