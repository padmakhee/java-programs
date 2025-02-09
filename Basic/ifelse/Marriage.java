import java.util.Scanner;
class Marriage
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter name:");
 String name=sc.next();
 System.out.println("enter age:");
 int age=sc.nextInt();
 if(age>=25 && age<=35)
{
   System.out.println(name+ " is eligible for marriage ");
}
else
{
   System.out.println(name+ " is not eligible for marriage");
}
}
}