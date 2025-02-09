class X
{
  public static void main(String[] args)
{
   int i,j,k;
   for(i=1;i<=5;i++)
   {
   for(j=5;j>=i;j--)
   {
     System.out.print(" ");
    }
    for(k=1;k<=i;k++)
     {
     if((i+k)%2==0)
     System.out.print("1 ");
     else
     System.out.print("0 ");
    }
    System.out.println();
    }
  }
}

