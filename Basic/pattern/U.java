/*
XXXXXXXXX
 XXXXXXX
  XXXXX
   XXX
    X
*/
class U
{
 public static void main(String[] args)
  {
     int i,j,k,l;
     for(i=1;i<=5;i++)
     { 
       for(j=1;j<i;j++)
       {
         System.out.print(" ");
       }
       for(k=5;k>=i;k--)
       {
         System.out.print("X");
       }
       for(l=5;l>i;l--)
       {
         System.out.print("X");
       }
      System.out.println();
     }
   }
} 


