class C
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==5||j==5||i+j==6)
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println(); 
        }
    }
}