package Collection_Framework;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListRev
{
    public static void main(String[] args)
    {
        List revlist=new ArrayList();
        revlist.add("ATB");
        revlist.add("MTB");
        revlist.add("PTB");
        revlist.add("Java for testers");

        System.out.println("Forward...\n");

        ListIterator iterator= revlist.listIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


        System.out.println("\nReverse...\n");

        ListIterator iterator1= revlist.listIterator(revlist.size());
        while(iterator1.hasPrevious())
        {
            System.out.println(iterator1.previous());
        }


    }
}
