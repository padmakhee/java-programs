import java.util.Arrays;
class SelectionSort
{
    public static void sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
           int min=i;
           for(int j=i+1;j<a.length;j++)
           {
                if(a[j]<a[min])
                min=j;
           }
           if(i != min)
           {
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
           }
        }
    }
    public static void main(String[] args)
    {
        int[] a={10,7,5,11,2,3};
        System.out.println("Before sorting array: "+Arrays.toString(a));
        sort(a);
        System.out.println("After sorting array: "+Arrays.toString(a));
    }
}