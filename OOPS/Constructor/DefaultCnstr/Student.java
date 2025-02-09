class Student
{
    String name;
    int age;
    int id;
    long mobile;
    Student(String name,int age,int id,long mobile)
    {
        this.name=name;
        this.age=age;
        this.id=id;
        this.mobile=mobile;
    }
    void display()
    {
        System.out.println(name+"\n"+age+"\n"+id+"\n"+mobile);
    }
    public static void main(String[] args)
    {
        Student s1=new Student("Miscsim",23,321,2234567890);
        Student s2=new Student("Ram",22,221,936765432);
        s1.display();
        s2.display();
    }
}