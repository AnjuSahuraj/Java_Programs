package Collection_Framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Studentmain
{
    public static void main(String[] args)
    {
        Student s1=new Student(12,"Amit");
        Student s2=new Student(30,"Sid");
        Student s3=new Student(25,"Zravin");

        List<Student> stds=new ArrayList<>();
        stds.add(s1);
        stds.add(s2);
        stds.add(s3);
        System.out.println(stds);

        System.out.println("After sort..");
        Collections.sort(stds,new SortBy());
        //Collections.sort(stds);
        System.out.println(stds);
    }
}
