import java.util.Scanner;
class RmvExtraSpace
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        s=s.trim();
        String s3="";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=' ')  s3 +=ch[i];
            if((ch[i]==' ') && (i<ch.length-1) && (ch[i+1]!=' '))
            {
                s3 += " ";
            }     

        }
        System.out.println(s3);
    }
}
