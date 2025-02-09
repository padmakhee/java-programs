// EDCBA
// DCBA
// CBA
// BA
// A
import java.util.Scanner;
class M
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character limit: ");
        char c=sc.next().charAt(0);
        for(char i=c;i>='A';i--)
        {
            for(char j=i;j>='A';j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}