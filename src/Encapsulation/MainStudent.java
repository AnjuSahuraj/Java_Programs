package Encapsulation;

public class MainStudent
{
    public static void main(String[] args)
    {
        Student s=new Student();
        s.name="Amit";//This is breaking encapsulation.Class variables should be binded within the student class.
        s.age=35;
        s.print();

        //To prevent this we have to use Getter and Setter
        //Variables must be private for encapsulation.

    }
}
