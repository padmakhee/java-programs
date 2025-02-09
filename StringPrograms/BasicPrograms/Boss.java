import java.util.Scanner;
class Boss
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    ch[j]='$';
                    break;
                }
            }
        }
        System.out.print(ch);
    }
}