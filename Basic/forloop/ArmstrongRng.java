import java.util.Scanner;
class ArmstrongRng
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int st=sc.nextInt();
        System.out.print("Enter ending number: ");
        int end=sc.nextInt();
		for (int i=st;i<=end;i++) {
            int num=i;
            int sum=0;
            int count=0;
			while(num>0) {
                num/=10;
                count++;
            }
            num=i; 
            while(num>0){
                int digit=num%10;
                int prod=1;
                
                for(int j=1;j<=count;j++) {
                    prod*=digit;
                }
                sum+=prod;
                num/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
	}
}