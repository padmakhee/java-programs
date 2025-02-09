class Mobile 
{
    String name;
    int ram;
    int rom;
    String color;
    Mobile()
    {
    } 
    Mobile(String name)
    {
        this();
        this.name=name;
    }
    Mobile(String name,int ram)
    {
        this(name);
        this.ram=ram;
    }
    Mobile(String name,int ram,int rom)
    {
        this(name,ram);
        this.rom=rom;
    }
    Mobile(String name,int ram,int rom,String color)
    {
        this(name,ram,rom);
        this.color=color;
    }
    public void display()
    {
        System.out.println(name+"\n"+ram+"\n"+rom+"\n"+color);
    }
    public static void main(String[] args)
    {
        Mobile m1=new Mobile("Redmi Note 12 pro+ 5g",4,128,"White");
        Mobile m2=new Mobile("Redmi Note 12 pro+ 5g",4,128,"White");
        m1.display();
        m2.display();
    }
}