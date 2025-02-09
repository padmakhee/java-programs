// Enter a number: 
// 25  (25*25)=625(Answer of last 2digit is same as input number digit)
// Automorphic
import java.util.Scanner;
class Automorphic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int sq=n*n;
        boolean flag=true;
        while(n>0)
        {
            if(n%10 != sq%10)
            {
                flag=false;
                break;
            }
            n=n/10;
            sq=sq/10;
        }
        if(flag)
            System.out.println("Automorphic");
        else
            System.out.println("Not a Automorphic");
    }
}