class Student
{
   String name;
   int age;
   int id;
   Student()
   {}
   Student(String name)
   {
    this.name=name;
   }
   Student(String name,int age)
   {
    this.name=name;
    this.age=age;
   }
   Student(String name,int age,int id)
   {
    this.name=name;
    this.age=age;
    this.id=id;
   }
   public void display()
   {
    System.out.println(name+"\n"+age+"\n"+id);
   }
   public static void main(String[] args)
   {
    Student s1=new Student();
    Student s2=new Student("Ambani");
    Student s3=new Student("sita",23);
    Student s4=new Student("Sringaar",22,231);
    s1.display();
    s2.display();
    s3.display();
    s4.display();
   }
}