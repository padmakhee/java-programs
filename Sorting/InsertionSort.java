import java.util.Arrays;
class InsertionSort
{
    public static void sort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
           for(int j=i+1;j>0;j--)
           {
                if(a[j]<a[j-1])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else 
                    break;
           }
        }
    }
    public static void main(String[] args)
    {
        int[] a={4,9,8,1,2,5,7,2};
        System.out.println("Before sorting array: "+Arrays.toString(a));
        sort(a);
        System.out.println("After sorting array: "+Arrays.toString(a));
    }
}