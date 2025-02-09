import java.util.Scanner;
class CountChar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        int uc=0;
        int lc=0;
        int nc=0;
        int sp=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i); 
            if(ch>='A' && ch<='Z')
                uc++;
            else if(ch>='a' && ch<='z')
                lc++;
            else if(ch>='0' && ch<='9')
                nc++;
            else
                sp++;
        }
        System.out.println("Upper Case:"+uc);
        System.out.println("Lower Case:"+lc);
        System.out.println("Number Case:"+nc);
        System.out.println("Special Character:"+sp);
    }
}