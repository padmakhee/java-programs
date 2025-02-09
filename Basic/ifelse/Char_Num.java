import java.util.Scanner;
class Char_Num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
        {
          System.out.println("It is a upper case character");
        }
        else if(ch>='a' && ch<='z')
        {
          System.out.println("It is a lower case character");  
        }
        else if(ch>='0' && ch<='9')
        {
          System.out.println("It is a number");
        }
        else
        {
          System.out.println("It is a special character");  
        }

    }
}