import java.util.Scanner;
class Ar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=0; 
        int temp=n;
        int sum=0;
        int r;
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }
        System.out.println("number of digit:"+count);
        temp=n;
        while(temp>0)
        {
          r=temp%10;
          sum=sum+(int)Math.pow(r,count);
          temp=temp/10;
        }
        if(sum==n)
        {
           System.out.println("Armstrong number");
        }
        else
        {
           System.out.println("no it's not an Armstrong number"); 
        }
    
    }
}