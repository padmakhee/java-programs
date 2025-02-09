class Account
{
    int bal;
    void displayBal()
    {
        System.out.println("Current Balance="+bal);
    }
    void withdraw(int amt)
    {
        if(amt>bal)
        {
            System.out.println("fail.insufficientbal");
            return;
        }
        bal=bal-amt;
        System.out.println(amt+" withdraw");
    }
}
class Test4
{
    public static void main(String[] args)
    {
        Account a1=new Account();
        a1.bal=5000;
        a1.displayBal();
        a1.withdraw(2000);
        a1.displayBal();
    }
}