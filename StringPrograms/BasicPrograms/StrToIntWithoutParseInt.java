import java.util.Scanner;
class StrToIntWithoutParseInt
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            num=(num*10)+(ch-'0');
        }
        System.out.println(num);
    }
}