package Static;

public class StaticDemo
{
    public static String s="The testing academy";
    public int version=10;
    public static void print1()
    {

        System.out.println(s);
        //System.out.println(version);
        // A static function can only access static variables since, static method is called before object creation.
        // Instance variable can be accessed only using objects.

    }

    public void print2()
    {
        //A normal function can access both static and non -static variables.
        System.out.println(s);
        System.out.println(version);
    }
}
