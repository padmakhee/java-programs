/*
12345
54321
12345
54321
12345
*/
class Q
{
  public static void main(String[] args)
   {
      int i,j;
      int count=0;
      for(i=1;i<=5;i++)
      {
        for(j=1;j<=5;j++)
        {
          if(i%2 != 0)
          {
          count ++;
          System.out.print(count);
          }
          else
          {
          System.out.print(count);
          count--;
          }
         }
       System.out.println();
      }
   }
}
