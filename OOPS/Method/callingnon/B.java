class B
{
  public void main(String[] args)
   {
     System.out.println("non-static main in class B");
    }
   public static void main(String[] args)
    {
       System.out.println("class B main starts");
       B obj= new B();
       obj.main(null);
       System.out.println("class B main ends");
      }
}
