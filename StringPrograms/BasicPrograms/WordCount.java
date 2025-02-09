import java.util.Scanner;
public class WordCount
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s=sc.nextLine();
        int count=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                if(flag)
                flag=false;
            }
            else
            {
                if(!flag)
                {
                    count++;
                    flag=true;
                }
            }
        }
        System.out.println("Number of words present in above string: "+count);
    }
}