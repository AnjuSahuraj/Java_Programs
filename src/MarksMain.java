import java.util.Scanner;

public class MarksMain
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks:");
        float m= s.nextFloat();
        Marks m1=new Marks();
        m1.grade(m);
    }
}