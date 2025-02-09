import java.util.Scanner;
class Revline
{
    public static String rev(String s)
    {
        int i=s.length()-1;
        int j=s.length()-1;
        String s2=" ";
        while(i>=0)
        {
            while(i>=0 && s.charAt(i)!=' ') i--;
            int k=i+1;
            String temp=" ";
            while(k<=j)
            {
                temp+=s.charAt(k);
                k++;
            }
            s2 += temp;
            if(i>=0)
            s2 +=" ";
            i--;
            j=i;
        }
        return s2;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        System.out.println("After Reversing line:\n"+(rev(s)));
    }
}