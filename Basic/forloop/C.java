class C
{
public static void main(String[] args)
{
int n=39684;
int sum=0;
while(n>0)
{
 sum += n%10;
 n=n/10;
 if(n == 0 && sum>9)
 {
    n=sum;
    sum=0;
 }
}
System.out.println(sum);
}
}