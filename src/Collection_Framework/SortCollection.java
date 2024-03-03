package Collection_Framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollection
{
    public static void main(String[] args)
    {
        List l=new ArrayList();
        l.add(86);
        l.add(55);
        l.add(90);
        System.out.println("Before Sorting\n");
        System.out.println(l);

        Collections.sort(l);

        System.out.println("After sorting\n");
        System.out.println(l);


    }
}
