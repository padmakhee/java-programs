import java.util.Scanner;
class Primerng
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int st=sc.nextInt();
        System.out.println("Enter ending number: ");
        int end=sc.nextInt();
		int count=0;
		for(int i=st;i<=end;i++)
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
                System.out.println(i);
			}
		}	
	}
}