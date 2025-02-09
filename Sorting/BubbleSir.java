import java.util.Arrays;
public class BubbleSir
{
    public static void sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
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
        int[] a={4,7,9,1,2,4,5,7,9,};
        System.out.println("Before sorting array: "+Arrays.toString(a));
        sort(a);
        System.out.println("After sorting array: "+Arrays.toString(a));
    }
}