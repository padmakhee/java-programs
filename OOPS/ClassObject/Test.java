class Account
{
    int bal;
}
class Test
{
    public static void main(String[] args)
    {
        Account a1;
        a1=new Account();
        a1.bal=1000;
        System.out.println(a1.bal);
        Account a2=a1;
        System.out.println(a2.bal);
    }
}
