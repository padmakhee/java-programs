import java.util.Arrays;
public class BubbleSort
{
    public static void Bubble(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args)
    {
        int[] a={4,7,9,1,2,4,5,7,9};
        Bubble(a);
        System.out.println("Sorted Array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}