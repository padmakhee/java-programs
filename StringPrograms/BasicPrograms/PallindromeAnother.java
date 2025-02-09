import java.util.Scanner;
class PallindromeAnother
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev += s.charAt(i);
        }
        if(s.equals(rev))
        {
        System.out.println(s+" is a pallindrome String");
        }
        else
        {
        System.out.println(s+" is not a pallindrome String");
        }
    }
}