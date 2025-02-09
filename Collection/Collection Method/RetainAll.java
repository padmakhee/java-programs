import java.util.ArrayList;
public class RetainAll
{
    public static void main(String[] args)
    {
        ArrayList a1=new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(70);
        ArrayList a2=new ArrayList();
        a2.add(10);
        a2.add(80);
        System.out.println("a1="+a1);
        a1.retainAll(a2);
        System.out.println("a1="+a1);
    }
}