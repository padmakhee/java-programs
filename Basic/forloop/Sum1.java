import java.util.Scanner;
class Sum1
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter range:");
       int n=sc.nextInt();
       int sum=0;
       String str="";
       for(int i=1;i<=n;i++)
       {
        sum=sum+i;
        str=str+i;
        if(i<n) 
        str+="+";
       }
       str=str+"="+sum;
       System.out.print(str);
    }
}