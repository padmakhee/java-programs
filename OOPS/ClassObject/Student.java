class Student
{
    String Name;
    int Age;
    int id;
    public void display()
    {
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(id);
    }
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.Name="Ram";
        s1.Age=22;
        s1.id=512;

        Student s2=new Student();
        s2.Name="Ram";
        s2.Age=23;
        s2.id=518;

        Student s3=new Student();
        s3.Name="Ram";
        s3.Age=23;
        s3.id=514;

        s1.display();
        System.out.println("===========");
        s2.display();
        System.out.println("===========");
        s3.display();
    }
}