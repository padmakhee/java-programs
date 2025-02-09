/*
        X
      XXX
    XXXXX
  XXXXXXX
XXXXXXXXX
  XXXXXXX
    XXXXX
      XXX
        X
*/
import java.util.Scanner;
class R
{
  public static void main(String[] args)
   {
      Scanner sc  = new Scanner(System.in);
      System.out.println("enter value :");
      int n=sc.nextInt();
      int spaces=n/2;
      int stars=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=spaces;j++)
         {
           System.out.print(" ");
         }
        for(int j=1; j<=stars; j++)
         {
           System.out.print("X");
         }
         System.out.println();
         if(i<=n/2)
         {
           spaces--;
           stars += 2;
          }
         else
         {
            spaces++;
            stars -= 2;
          }
        }
    }
}