import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Password
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a password: ");
        String pwd=sc.nextLine();
        if(isPassword(pwd))
        System.out.println("valid");
        else
        System.out.println("Invalid");
    }
    static boolean isPassword(String pwd)
    {
        String exp="(?=.*[!@#$^&])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,15}";
        Pattern ptrn=Pattern.compile(exp);
        return ptrn.matcher(pwd).matches();
    }

}
