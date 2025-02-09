import java.util.Scanner;
class MinOccChar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int min=Integer.MAX_VALUE;
        String s2="";
        for(int i=0;i<ch.length;i++)
        {
            int count=1;
            if(ch[i]=='\u0000') continue;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                    ch[j]='\u0000';
                }
            }
            if(count<min)
            {
                min=count;
                s2="";
                s2 += ch[i];
            }
        }
        System.out.println("Minimum occured character is"+s2+"="+min);
    }
}