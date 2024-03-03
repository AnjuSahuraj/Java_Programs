package Collection_Framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddList
{
    public static void main(String[] args)
    {
        List<String> courselist=new ArrayList<>();
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PTB");

        System.out.println(courselist);

        System.out.println("----------------------");

        List numlist=new ArrayList();
        numlist.add(1);
        numlist.add(12);

        courselist.addAll(numlist);
        System.out.println(courselist);

        System.out.println("Print after iteration...");

        Iterator iterator= courselist.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
