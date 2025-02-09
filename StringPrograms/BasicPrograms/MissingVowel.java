import java.util.Scanner;
class MissingVowel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        String s2="AEIOUaeiou";
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            if(!s.contains(ch+""))
            System.out.print(ch);
        }
    }
}