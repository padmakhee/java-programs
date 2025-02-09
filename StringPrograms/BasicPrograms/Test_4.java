import java.util.Scanner;
class Test_4
{
    public static void main(String[] args)
    {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a String: ");
        // String s=sc.nextLine();
        String s="jspiders";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='i')
            ch[i]='I';
            System.out.println(ch[i]);
        }

    }
}