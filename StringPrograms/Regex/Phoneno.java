import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Phoneno
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter phone no.: ");
        String phn=sc.nextLine();
        if(isPhoneNum(phn))
        System.out.println("valid");
        else
        System.out.println("Invalid");
    }
    static boolean isPhoneNum(String p)
    {
        Pattern ptrn=Pattern.compile("[6-9][0-9]{9}");
        return ptrn.matcher(p).matches();
    }
}