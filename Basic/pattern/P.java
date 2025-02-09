/*
 *****
  *  *
   * *
    **
     *
*/
class P
{
 public static void main(String[] args)
  {
     int i,j,k;
       for(i=1;i<=5;i++)
       {
       for(j=1;j<=i;j++)
        {
            System.out.print(" ");
        }
       for(k=5;k>=i;k--)
        {
            if(k==5|| i==1 || i==k)
            System.out.print("*");
            else 
            System.out.print(" ");
        }
       
          System.out.println();
      }
   }  
}