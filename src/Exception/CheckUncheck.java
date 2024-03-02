package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckUncheck
{
    public static void main(String[] args)
    {
        //String name=null;
        //name.trim();//Unchecked exception-->JVM will only know this at runtime

        try
        {
            FileInputStream f = new FileInputStream("dasda");//Checked exception-->JVM knows at compile time
        }catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException |
               FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("I will be executed anyhow....");
        }
    }
}
