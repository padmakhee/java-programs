import java.util.Scanner;
class Day
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter month:");
        int month=sc.nextInt();
        System.out.println("enter year:");
        int y=sc.nextInt();
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:System.out.println("31 Days");
                    break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.println("30 Days");
                    break;
            case 2:if((y%400==0 && y%100!=0) || y%4==0)
            { 
               System.out.println("Leap year");
            }
            else
            {
               System.out.println("Not a Leap year");
            }
            break;
            default:System.out.println("err:enter valid month");
        }
    }
}
