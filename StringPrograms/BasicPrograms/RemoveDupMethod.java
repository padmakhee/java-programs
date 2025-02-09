import java.util.Scanner;
class RemoveDupMethod
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1=sc.nextLine();
        String s2="";
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(s2.indexOf(c)<0)
            s2+=c;
        }
        System.out.print(s2);
    }
}