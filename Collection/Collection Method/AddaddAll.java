import java.util.ArrayList;
public class AddaddAll
{
    public static void main(String[] args)
    {
        ArrayList a1=new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(70);
        ArrayList a2=new ArrayList();
        a2.add(40);
        a2.add(50);
        System.out.println(a2);
        a2.addAll(a1);
        System.out.println(a2);
    }
}