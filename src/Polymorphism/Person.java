package Polymorphism;

public class Person
{
    //Method Overloading-->Same name different parameter-->This is compile type polymorphism since its decided only when object is created.
    //This is also called as Early binding.
    void speak(String s)
    {
        System.out.println( "S is a String-->" +s);
    }

    void speak(int a)
    {
        System.out.println("a is an integer-->" +a);
    }
}
