package Polymorphism;

public class MainDog
{
    public static void main(String[] args)
    {
        Dog d1=new Dog();
        d1.bark();
        Dog d2=new Hound();//Dynamic dispatch or runtime polymorphism
        d2.bark();
    }
}
