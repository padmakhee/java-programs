class A
{
   int i;
   int j;
   int k;
   A(int i,int j,int k)
   {
    this.i=i;
    this.j=j;
    this.k=k;
   }
   A(int i)
   {
    this.i=i;
   }
   A(int i,int j)
   {
    this.i=i;
    this.j=j;
   }
   public void display()
   {
    System.out.println(i+"\t"+j+"\t"+k);
   }
   public static void main(String[] args)
   {
    A a=new A(2,3,4);
    A a1=new A(2,6);
    A a2=new A(99);
    a.display();
    a1.display();
    a2.display();
   }
}