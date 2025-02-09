import java.util.Scanner;
class ArrangeString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        String uc="";
        String lc="";
        String nc="";
        String sp="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z')
            uc=uc+ch;
            else if(ch>='a' && ch<='z')
            lc=lc+ch;
            else if(ch>='0' && ch<='9')
            nc=nc+ch;
            else
            sp=sp+ch;
        }
        s=uc+lc+nc+sp;
        System.out.println(s);
    }
}