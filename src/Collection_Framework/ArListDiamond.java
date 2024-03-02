package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArListDiamond
{
    public static void main(String[] args)
    {
        List<String> ml=new ArrayList<>();//This diamond operator will allow only string.
        ml.add("Amit");
        ml.add("Sid");
        //ml.add(123);

        //Different ways of printing

        for(String s:ml)
        {
            System.out.println(s);
        }
        System.out.println("---------------");
        for(int i=0;i<ml.size();i++)
        {
            System.out.println(ml.get(i));
        }

        System.out.println("---------------");

        Iterator iterator=ml.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
