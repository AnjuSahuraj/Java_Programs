package Exception;

public class ThrowsC
{
    public static void main(String[] args)throws Exception
    {
        method(10);
    }
    static void method(int b)throws Exception
    {
        int a1=10/b;
        int a2=10/0;
        int a3=0/b;
    }
}
