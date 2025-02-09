import java.util.Scanner;
class Arm
{ 
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number:");
    int n=sc.nextInt();
    int count=0;
    int r; 
    int temp=n;
    while(n!=0)
    { 
      n/=10;
      count++;
    }
    System.out.println("number of digits:"+count);
    n=temp;
    int sum=0;
    while(n!=0)
    {
      r=n%10;
      int prod=1;
      for(int i=1;i<=count;i++)
      {
        prod=prod*r;
      }
      sum=sum+prod;
      n=n/10;
    }
    if(sum==temp)
      System.out.println("armstrong number");
    else
      System.out.println("not a armstrong number");
  }
}