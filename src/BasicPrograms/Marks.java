package BasicPrograms;

public class Marks
{
    void grade(float m)
    {
        if(m>=90)
        {
            System.out.println("Grade is A+");
        }
        else if (m>=80 && m<90)
        {
            System.out.println("Grade is A");
        }
        else if (m>=70 && m<80)
        {
            System.out.println("Grade is B");
        }
        else if (m>=60 && m<70)
        {
            System.out.println("Grade is C");
        }
        else if (m>=50 && m<60)
        {
            System.out.println("Grade is D");
        }
        else
        {
            System.out.println("You have failed!!!");
        }
    }

}
