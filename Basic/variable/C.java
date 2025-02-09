class C
{
  int j=10; //instance or non-static variable
  static int k=20; //static variable
  public static void main(String[] args)
   {
     int l=30; //local variable for main();
     System.out.println(k);
     System.out.println(l);
     C obj=new C();
     System.out.println(obj.j);
   }
}