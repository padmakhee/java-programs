class E
{ 
   static int i;
   public static void main(String[] args)
    {
       System.out.println(i);\\0
       int i=1;
       System.out.println(i);\\1
       System.out.println(E.i);\\0
     }
}

