import java.util.Scanner;
class HighestPrime
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int st=sc.nextInt();
        System.out.print("Enter ending number: ");
        int end=sc.nextInt();
		int count=0;
		for(int i=end;i>=st;i--)
		{
			boolean flag=true;
			int n=i;
			
			if(n<=1)
				continue;
			for(int j=2;j<=n/2;j++)
			{
				if(n%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				count++;
			}
			if(count==1)
			{
				System.out.println(i);
				break;
			}
			
		}
		
	}
}