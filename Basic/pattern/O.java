/*
    *
   **
  * *
 *  *
*****
*/
class O
{
 public static void main(String[] args)
  {
     int i,j,k;
       for(i=1;i<=5;i++)
       {
      for(j=4;j>=i;j--)
        {
           System.out.print(" ");
        }
        for(k=1;k<=i;k++)
         {
            if(i==5 || k==1 || i==k)
            System.out.print("*");
            else 
            System.out.print(" ");
         }
         System.out.println();
      }
   }  
}