import java.util.Scanner;
class ReverseNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        String ch="";
        while(n>0)
        {
            int r=n%10;
            ch=ch+r;
            n=n/10;
        }
        System.out.println("Reverse of given no:"+ch);
    }
}
