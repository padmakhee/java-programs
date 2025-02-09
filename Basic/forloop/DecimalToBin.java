import java.util.Scanner;
class DecimalToBin
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal Number: ");
        int n=sc.nextInt();

        String str="";
        while(n>0)
        {
            int bit=n%2;
            str=bit+str;
            n/=2;
        }
        System.out.println(str);
    }
}