   class Sneak 
   {
	public static void main(String[] args) 
	{	
		int n=5;
		int count=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i%2!=0)
				{
					count++;
					System.out.print(count+"\t");
				}
				else 
				{
			       System.out.print(count+"\t");
				   count --;
				}
			}
			System.out.println();
			count += 5;
		}
		
	}
}
				
