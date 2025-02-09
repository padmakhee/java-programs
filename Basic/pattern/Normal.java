/*
1
12
123
1234
12345 
*/
// import java.util.Scanner;
class Normal
{
public static void main(String[] args)
{
  //  Scanner sc=new Scanner(System.in);
  //  System.out.println("enter size:");
  //  int n=sc.nextInt();
   int i,j,k;
   for(i=5;i>=1;i--)
    {
      for(j=1;j<i;j++)
      {
         System.out.print(" ");
      }
      for(k=5;k>=i;k--)
      {
        System.out.print(k);
      }
     System.out.println( );
    }
  }
}
   