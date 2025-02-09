class C
{ 
   static  int i;
   int j;
   public static void main(String[] args)
   {
     System.out.println(C.i);
     C c1 = new C();
     c1.j=10;
     C c2 = new C();
     c2.j=20;
     System.out.println(c1.j);
     System.out.println(c2.j);
   }
}