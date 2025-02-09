class D
{ 
   static  int i;
   int j;
   public static void main(String[] args)
   {
     System.out.println(D.i);
     D d1 = new D();
     d1.i=10;
     D d2 = new D();
     d2.i=20;
     System.out.println(d1.i);
     System.out.println(d2.i);
   }
}