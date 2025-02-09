class Test_5
{
    public static void main(String[] args)
    {
        String s="aaabbccdd";
        char[] ch=s.toCharArray();
        String temp=" ";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='\u0000')
            {
                continue;
            }
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    ch[j]='\u0000';
                }
            }
            temp+=ch[i];
        }
        System.out.print(temp);
    }
}