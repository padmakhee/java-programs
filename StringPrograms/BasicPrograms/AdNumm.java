import java.util.Scanner;
public class AdNumm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Alpha-Numeric String: ");
        String s=sc.nextLine();
        System.out.print("Sum of the numbers are: "+add(s));
    }
    static int add(String s)
    {
        char[] a=s.toCharArray();
        int sum=0;
        String s1="";
        int i=0;
        while(i<a.length)
        {
            s1="";
            while(i<a.length && a[i]>='0' && a[i]<='9')
            {
                s1 += a[i];
                i++;
            }
            if(s1.length()>0)
            sum += Integer.parseInt(s1);
            i++;
        }
        return sum;
    }
}