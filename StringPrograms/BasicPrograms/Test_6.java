class Test_6
{
    public static void main(String[] args)
    {
        String s1="java"+"dev";//3 obj(scp)
        String s2="dev";//0 obj
        String s3="java"+s2;//1 obj(heap area)
        String s4="javadev";//0 obj
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//true
        System.out.println(s3==s4);//false
        System.out.println(s1);//javadev
        System.out.println(s3);//javadev
        System.out.println(s4);//javadev
    }
}