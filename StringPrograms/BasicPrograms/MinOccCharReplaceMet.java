import java.util.Scanner;
class MinOccCharReplaceMet
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1=sc.nextLine();
        String s2="";
        int minCount=s1.length();
        char minChar=' ';
        while(s1.length() != 0)
        {
            char ch=s1.charAt(0);
            s2=s1.replace(ch+"","");
            int count=s1.length()-s2.length();
            System.out.println(ch+"="+count);
            if(count<minCount)
            {
                minCount=count;
                minChar=ch;
            }
            s1=s2;
        }
        System.out.println("=================");
        System.out.println(minChar+"="+minCount);
    }
}