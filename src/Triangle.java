import java.util.Scanner;

public class Triangle
{
    void classify()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of sides of the triangle:");
        float f1=s.nextFloat();
        float f2=s.nextFloat();
        float f3=s.nextFloat();
        if(f1==f2 && f2==f3)
        {
            System.out.println("Triangle is equilateral");
        }
        else if(f1==f2 && f2!=f3)
        {
            System.out.println("Triangle is isosceles");
        }
        else
        {
            System.out.println("Triangle is scalene");
        }
    }
}
