// Enter a string: 
// Padmakhee is a
// Revesrse words of Given line are:
// eehkamdaP si a
import java.util.Scanner;
class RevWords
{
    public static String rev(String s)
    {
        int i=0;
        int j=0;
        String s2="";
        while(j<s.length())
        {
            while(j<s.length() && s.charAt(j)!=' ')
            j++;
            int k=j-1;
            String temp="";
            while(k>=i)
            {
                temp += s.charAt(k);
                k--;
            }
            s2+=temp;
            if(j<s.length())
            s2+=" ";
            j++;
            i=j;
        }
        return s2;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        System.out.println("Revesrse words of Given line are:\n"+rev(s));
    }
}