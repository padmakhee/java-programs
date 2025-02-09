import java.util.Scanner;
class Pallindrome
{
    public static boolean isPallindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        if(isPallindrome(s))
        System.out.println(s+" is a pallindrome String");
        else
        System.out.println(s+" is not a pallindrome String");
    }

}