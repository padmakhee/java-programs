class Student
{
    String name;
    int age;
    long mobile;
    Student(String name,int age,long mobile)
    {
        this.name=name;
        this.age=age;
        this.mobile=mobile;
    }
    Student(Student s)
    {
        this.name=s.name;
        this.age=s.age;
        this.mobile=s.mobile;
    }
    public void display()
    {
        System.out.println(name+"\n"+age+"\n"+mobile);
    }
}
class Demo
{
    public static void main(String[] args)
    {
        Student s1=new Student("SitaRam",23,876325413);
        Student s2=new Student(s1);
        s1.display();
        s2.display();
    }
}