import java.util.Scanner;
class B
{
   public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number:");
      int n = sc.nextInt();
      int pro=1;
      String str=" ";
      for(int i=1; i<=n; i++)
      {
        pro *= i;
         str  += i;
         if(i<n) str +=  "*";
            
      }
      str= str +"="+pro;
      System.out.println(str);
}
}
      
      