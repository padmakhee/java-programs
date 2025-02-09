class K
{
    public static void main(String[] args)
    {
        int s=0;
        for(int i=1;i<=5;i++)
        {
            s=s+i;
            for(int j=s;j>s-i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}