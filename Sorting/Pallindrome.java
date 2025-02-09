public class Pallindrome
{
    public static void main(String[] args)
    {
        boolean isPallindrome=isPallindrome(0,2,"aba");
        System.out.println(isPallindrome);
    }
    public static boolean isPallindrome(int i,int j,String str)
    {
        if(i>=j)
        {
            return true;
        }
        if(str.charAt(i)!=str.charAt(j))
        {
            return false;
        }
        i=i+1;
        j=j-1;
        return isPallindrome(i,j,str);
    }
}