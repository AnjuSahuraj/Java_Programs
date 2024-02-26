package Interface;

interface Father
{
    int a=10;
    void loan();
    default void print()
    {
        System.out.println("Hi I am default interface method");
    }
}
