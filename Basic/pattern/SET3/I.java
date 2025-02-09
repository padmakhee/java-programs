// ABCDE
// ABCD
// ABC
// AB
// A
import java.util.Scanner;
class I
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character limit: ");
        char c=sc.next().charAt(0);
        for(int i=1;i<=5;i++)
        {
            for(char j='A';j<=c-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}