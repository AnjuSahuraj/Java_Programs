package Exception;

public class ThrowC
{
    public static void main(String[] args)
    {
        extracted(0);
    }
    static void extracted(int b)
    {
        int a=10;
        if(b==0)
        {
            throw new ArithmeticException("B can't be zero");//Here we are creating the object, not JVM
        }
        else
        {
            System.out.println(a/b);
        }
    }
}
