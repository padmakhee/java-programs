//package com.inheritance;
class A
{
    int i;
    static void m1()
    {
        System.out.println("M1-A");
    }
}
class B extends A
{
    void m2()
    { 
        System.out.println("M2-B");
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        A a = new A();
        System.out.println(a.i);
        a.m1();
        //a.m2();
        B b = new B();
        System.out.println(b.i);
        b.m1();
        b.m2();
    }
}