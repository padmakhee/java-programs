class Emp
{
    String name;
    int empid;
    int age;
    Emp(String name,int empid,int age)
    {
        this.name=name;
        this.empid=empid;
        this.age=age;
    }
    public void display()
    {
        System.out.println(name+"\n"+empid+"\n"+age);
    }
    public static void main(String[] args)
    {
        Emp e1=new Emp("Lotus",321,23);
        Emp e2=new Emp("Ipsit",521,24);
        e1.display();
        e2.display();
    }
}