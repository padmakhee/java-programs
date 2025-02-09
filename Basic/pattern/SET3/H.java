// AAAAA
// BBBB
// CCC
// DD
// E
import java.util.Scanner;
class H
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character limit: ");
        char c=sc.next().charAt(0);
        for(char i='A';i<=c;i++)
        {
            for(int j=c-i+1;j>0;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}