import java.util.Scanner;
class Alterperfect
{
    public static boolean isPerfect(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            sum=sum+i;
            
        }
        if(n==sum)
        return true;
        else
        return false;
        
    }
    public static void range(int st,int end)
    {
        int count=0;
        for(int i=st;i<=end;i++)
        {
            //int count=0;
            if(isPerfect(i))
            {
                count++;
                if(count%2 != 0)
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int st=sc.nextInt();
        System.out.print("Enter ending number: ");
        int end=sc.nextInt();
        range(st,end);
    }
}