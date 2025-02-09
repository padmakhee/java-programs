// ABCDE
// BCDE
// CDE
// DE
// E
import java.util.Scanner;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character limit: ");
        char c=sc.next().charAt(0);
        for(char i='A';i<=c;i++)
        {
            for(char j=i;j<=c;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}