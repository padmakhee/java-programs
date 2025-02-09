import java.util.Scanner;
class ConsoUnderScore
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.print(ch);
            }
            else
            {
                System.out.print("_");
                count++;
            }
        }
        if(count<3)
        System.out.println(s);
        else
        System.out.println("");       
    }
}