//To generate a Random number in java [ int n=(int)(Math.random()*9)+1 ]
import java.util.Scanner;
class Random
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name=sc.next();
        int n=(int) (Math.random()*9)+1;
        int score=0;
        for(int i=3;i>=1;i--)
        {
            System.out.println("Guess a Number(1-9)");
            int num=sc.nextInt();
            if(n==num)
            {
                System.out.println("Your Guess is Correct");
                score += 10;
                n=(int) (Math.random()*9)+1;
            }
            else
                System.out.println("You have " +(i-1)+ "chances left");
        }
    }
}