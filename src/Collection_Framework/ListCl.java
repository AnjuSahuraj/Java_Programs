package Collection_Framework;

import java.util.List;

public class ListCl
{
    public static void main(String[] args)
    {
        List fruits=List.of("Apple","Orange","Pineapple");
        List ddt=List.of("Amit","123");
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());
        System.out.println(fruits.indexOf("Pineapple"));
        System.out.println(fruits.isEmpty());

        //Here in this type we cannot add an item to the list.

        //Arraylist , LinkedList-->possible to add item
    }
}
