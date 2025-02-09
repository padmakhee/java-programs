import java.util.Scanner;
class RmvDup
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1=sc.nextLine();
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            boolean flag=true;
            for(int j=0;j<i;j++)
            {
                if(ch[i]==ch[j])
                flag=false;
            }
            if(flag)
                System.out.print(ch[i]);
        }
    }
}