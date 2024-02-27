package BasicPrograms;

public class AnonymousClass
{
    public static void main(String[] args)
    {
        Student s=new Student()
        {
            //This is an Anonymous class which implements the interface class
            @Override
            public void print()
            {
                System.out.println("Anonymous class printed me!!!!");
            }
        };
        s.print();
    }
}
class A
{

}
interface Student
{
    void print();
}
