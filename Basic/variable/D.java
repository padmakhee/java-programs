class D
{ 
  int s=3; //non-static variable
  static int t=4; //static variable
  public static void main(String[] args)
  {
    System.out.println(t);
    D obj=new D();
    System.out.println(obj.s*3);
  }
}


       