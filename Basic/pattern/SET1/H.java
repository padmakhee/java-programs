// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE
import java.util.Scanner;
class H
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a char limit: ");
        char c=sc.next().charAt(0);
        for(char i='A';i<=c;i++)
        {
            for(char j='A';j<=c;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        } 
    }
}