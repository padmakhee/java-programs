class B
{ 
  static int i=1;//static variable
  public static void main(String[] args)
   {
     System.out.println(B.i);
     B.i=2;
     System.out.println(B.i);
     B.i=3;
     System.out.println(B.i);
  }
}