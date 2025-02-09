/*
1
3       2
4       5       6
10      9       8       7
11      12      13      14      15
*/
class K
{
public static void main(String[] args)
{
   int sum=0;
   for(int i=1;i<=5;i++)
    {
        sum += i;
        if(i%2 != 0)
        {
          int num=sum-i;
          for(int j=1;j<=i;j++)
           {
             num++;
             System.out.print(num+"\t");
            }
         }
        else
        {
          int num=sum;
          for(int j=1;j<=i;j++)
           {
              System.out.print(num+"\t");
              num--;
           }
       }
  System.out.println( );
}
}
}

   