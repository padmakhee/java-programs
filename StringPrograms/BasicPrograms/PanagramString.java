import java.util.Scanner;
class PanagramString 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        if(isPanagram(s))
        System.out.println(s+" is a Panagram String");
        else
        System.out.println(s+" is not a Panagram String");
    }
    public static boolean isPanagram(String s)
    {
        if(s.length()<26)
            return false; 
            s=s.toLowerCase();   
        for(char ch='a';ch<='z';ch++)
        {
            if(!s.contains(ch+""))
            return false;
        }
        return true;
    }
}