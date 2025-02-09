import java.util.Scanner;
public class StringLength
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int count=0;
        for(char n:ch)
        {
            count++;
        }
        System.out.print(count);
    }
}