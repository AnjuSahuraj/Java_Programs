package Static;

public class RC
{
    public static void main(String[] args)//This is why main method is static, so that it will be called by JVM before object creation.
    {
        StaticDemo sd=new StaticDemo();
        StaticDemo.print1();
        sd.print2();
    }
}
