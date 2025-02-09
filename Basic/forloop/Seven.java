import java.util.Scanner;
class Seven
{
  public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number:");
      int n=sc.nextInt();
      int a=0;
      int esum=0;
      int osum=0;
      while(n>0)      
       {
             a=n%10;
             if(a%2==0) 
             {
              esum+=a;  
              }       
            else{
                osum +=a;
             }
            n=n/10;
       }
      System.out.println("sum of even number"+esum);
      System.out.println("sum of odd number"+osum);

}
}

