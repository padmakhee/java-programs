//3456=18=9
class A
{ 
  public static void main(String[] args)
   {
     int sum=0;
     int n=5436;
     do{
            while(n>0)
            {
                sum += n%10;
                n=n/10;
             } 
               n=sum;
               sum=0;
              }
             while(n>9);
            System.out.println(n);
}
}