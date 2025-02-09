/*
12345
54321
12345
54321
12345
*/
// import java.util.Scanner;
class L
{
   public static void main(String[] args)
    {
      // Scanner sc=new Scanner(System.in);
      // System.out.println("enter the size:");
      //  int size=sc.nextInt();
      int i,j,k;
      for(i=1;i<=5;i++)
       {
         for(j=1;j<=5;j++)
          {
             if(i%2 != 0)
             System.out.print(j);
           }
               if(i%2 == 0)
                 for(k=5;k>=1;k--)
                System.out.print(k);
            
        System.out.println();
     }
}
}