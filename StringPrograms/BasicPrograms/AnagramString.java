import java.util.Scanner;
class AnagramString
{
    public static boolean isAnagram(String s1,String s2)
    {
        while(true)
        {
            if(s1.length()!=s2.length())
                return false;
            if(s1.length()==0 && s2.length()==0)
                return true;
            char ch=s1.charAt(0);
            s1=s1.replace(ch+"","");
            s2=s2.replace(ch+"","");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s1=sc.nextLine();
        System.out.print("Enter second String: ");
        String s2=sc.nextLine();
        if(isAnagram(s1,s2))
        System.out.println(s1+" and "+s2+" both are ANAGRAM string");
        else
        System.out.println(s1+" and "+s2+" both are not a ANAGRAM string");
    }
}
