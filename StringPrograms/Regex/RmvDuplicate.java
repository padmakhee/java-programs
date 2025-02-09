import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class RmvDuplicate
{
    static String RmvDuplicate(String str)
    {
        String exp="(.)(?=.*\\1)";
        Pattern p=Pattern.compile(exp);
        Matcher m = p.matcher(str);
        return m.replaceAll("");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        String result=RmvDuplicate(str);
        System.out.println("Original String: "+str);
        System.out.print("String After Removing Duplicates: "+result);
    }
}