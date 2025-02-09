import java.util.LinkedList;
public class toArray
{
    public static void main(String[] args)
    {
        LinkedList a1=new LinkedList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(70);
        Object[] arr=a1.toArray();
        for(Object a:arr)
        {
            System.out.println(a);
        }
    }
}