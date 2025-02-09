import java.util.Scanner;
class Sumrange
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter starting range:");
        int a=sc.nextInt();
        System.out.print("enter ending range:");
        int b=sc.nextInt();
        int sum=0;
        String str="";
        for(int i=a;i<=b;i++)
        { 
            sum=sum+i;
            str=str+i;
            if(i<b)
            str=str+"+";
        }
        str=str+"="+sum;
        System.out.print(str);
    }
}