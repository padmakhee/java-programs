import java.util.Scanner;
class Test1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String: ");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
           System.out.print(s.charAt(i)); 
        }
    }
}
