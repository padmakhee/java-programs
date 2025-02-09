/*
XXXXX
X   X
X   X
X   X
XXXXX  */
// import java.util.Scanner;
class D
{
public static void main(String[] args)
{   
   // Scanner sc=new Scanner(System.in);
   // System.out.println("enter a number:");
   // int n=sc.nextInt();
   
   for(int i=1;i<=5;i++)
   {
     for(int j=1;j<=5;j++)
      {
        if(i==1 || i==5 || j==1 || j==5)
         {
            System.out.print("X");
         }
         else
         {
            System.out.print(" ");
         }
      }
      System.out.println( );
   }
}
}