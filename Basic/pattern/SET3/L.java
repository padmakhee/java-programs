// EDCBA
// EDCB
// EDC
// ED
// E
import java.util.Scanner;
class L
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character limit: ");
        char c=sc.next().charAt(0);
        for(char i='A';i<=c;i++)
        {
            for(char j=c;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}