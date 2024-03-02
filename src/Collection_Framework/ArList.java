package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class ArList
{
    public static void main(String[] args)
    {
        List mylist=new ArrayList();
        mylist.add("Anju");
        mylist.add("Sid");
        System.out.println(mylist);
        mylist.add(0,"Shinu");
        System.out.println(mylist);

        for(Object o :mylist)
        {
            System.out.println(mylist);
        }
    }
}
