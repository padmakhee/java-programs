import java.util.Scanner;
class Hello
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            char temp='1';
            char ch1=ch[i];
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch1==ch[j])
                {
                    ch[i]='1';
                    temp++;
                    ch[j]=temp;
                }
            }
        }
        System.out.print(ch);
    }
}