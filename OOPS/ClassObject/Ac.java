class Test
{
   int CurrentTemp=16;
   void IncreaseTemp()
   {
    int IncreaseTemp=CurrentTemp();
   }
   int CurrentTemp()
   {
    CurrentTemp++;
    return CurrentTemp;
   }
}
class Ac
{
    public static void main(String[] args)
    {
        Test t=new Test();
        Test t1=new Test();
        t.IncreaseTemp();
        System.out.print(t.CurrentTemp);
    }
}