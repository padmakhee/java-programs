import java.util.Scanner;
class A
{
  public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter starting number: ");
      int st=sc.nextInt();
      System.out.println("enter ending number: ");
      int end=sc.nextInt();
      int sum=0;
      String str=" ";
      for(int i=end ; i>=st ; i--) {
      int n=i;
      sum=sum+i;
      str=str+i;
       if(n<i) str += "+";
    }
   str = str+"="+sum;
   System.out.println(str);   
   }
}