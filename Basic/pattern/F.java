/*
    *
   **
  ***
 ****
*****
*/
// import java.util.Scanner;
class F
{
 public static void main(String[] args)
  {
    //  Scanner sc=new Scanner(System.in);
    //  System.out.print("enter size:");
    //  int n=sc.nextInt();
     int i,j,k;
     for(i=1;i<=5;i++)
     {
       for(j=4;j>=i;j--)
        { 
          System.out.print(" ");
        }
       for(k=1;k<=i;k++)
        { 
          System.out.print("*");
        }
        System.out.println();
      }
   }  
}