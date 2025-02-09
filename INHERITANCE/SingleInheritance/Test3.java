class Human
{
    String name;
    int age;
    public Human(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
class Student extends Human
{
    int sid;
    long MobileNum;
    Student(String name,int age,int sid,long MobileNum)
    {
        super(name,age);//meaning
        this.sid=sid;
        this.MobileNum=MobileNum;
    }
    public void display()
    {
        System.out.println(name+"\n"+age+"\n"+sid+"\n"+MobileNum);
    }
}
public class Test3
{
    public static void main(String[] args)
    {
        Student s1=new Student("Ram",26,1,1398674253);
        Student s2=new Student("Shyam",23,2,637274252);
        s1.display();
        s2.display();
    }
}