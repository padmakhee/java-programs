class Permutation
{
    public static void swap(String s,int i,int j)
    {
        char[] a=s.charArray();
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        return new String(a);
    }
    public static void main(String[] args)
    {
        String s="abcd";
        int end=s.length()-1;
        for(int i=0;i<=end;i++)
        {
            
        }
    }
}