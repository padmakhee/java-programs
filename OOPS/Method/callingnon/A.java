class Test
{
  int i;
  public static void m1()
  {
    System.out.println("M1 class a");
  }
  public static void m2()
  {
    System.out.println("M2 class a");
  }
}


class A
{
  public static void main(String []args)
  {
    Test t1=new Test();
    t1.m1();
    t1.m2();
  }
}
