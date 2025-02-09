import java.util.Scanner;

class Currency1
	{
    public static void main(String[] args) 
		{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amt = sc.nextInt();
		
        if (amt >= 2000) 
        {
            System.out.println("2000X"+(amt/2000));
            amt%=2000;
        }
        if(amt>=500)
			{
            System.out.println("500X"+(amt/500));
            amt%=500;
			}
        if(amt>=200)
			{
                
            System.out.println("200X"+ (amt/200));
            amt%=200;
			}
        if(amt>=100)
			{
            System.out.println("100X"+(amt/100));
            amt%=100;
        }
        if(amt>=50)
			{
            System.out.println("50X"+(amt/50));
            amt%=50;
			}
        if(amt>=20)
			{
            System.out.println("20X"+(amt/20));  
            amt%=20;
			}        
        if (amt>=10)
			{
            System.out.println("10X"+(amt/10));
            amt%=10;
			}
        if(amt>=5)
			{
            System.out.println("5X"+(amt/5));
            amt%=5;
			}
       if(amt>=2)
			{
            System.out.println("2X"+(amt/2));
            amt%=2;
			}

        if(amt>=1)
			{
            System.out.println("1X"+amt);  
			}
		}
	}