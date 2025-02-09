import java.util.Scanner;
class ConsoUndrScore
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        String s2="AEIOUaeiou";
        String s3="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(s2.contains(ch+""))
            s3 += ch;
            else
            {
                s3+="_";
                count++;
            }
        }
        if(count<3)
        System.out.println(s);
        else
        System.out.println(s3);
    }
}