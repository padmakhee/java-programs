class Animal
{
    void makeSound()
    {
        System.out.println("Sound of Animal");
    }
}
class Dog extends Animal
{
    @override
    void makeSound()
    {
        System.out.println("Bow Bow...");
    }
}
class Cat extends Animal
{
    /*@override
    void makeSound()
    {
        System.out.println("meow meow...");
        ("Not a M.O.");
    }*/
}
