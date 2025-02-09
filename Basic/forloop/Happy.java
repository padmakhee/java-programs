import java.util.Scanner;

class Happy 
{
    public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=s.nextInt();
        int temp=n;
        int sum=0;

        while(true) 
		{
            sum=0;
            while(n > 0) 
			{
                int rem=n%10; 
                sum+=rem*rem;
                n/=10; 
            }

            if(sum==1) 
			{ 
                System.out.println(temp + " is a Happy Number");
                break;
            } else if(sum==4)
			{ 
                System.out.println(temp + " is Not a Happy Number");
                break;
            }
            n=sum; 
        }
    }
}