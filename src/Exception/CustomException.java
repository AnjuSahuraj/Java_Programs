package Exception;

public class CustomException extends Exception
{
    public CustomException(String msg)
    {
        super(msg);
        System.out.println("If I got this,Custom Exception.");
    }
}
