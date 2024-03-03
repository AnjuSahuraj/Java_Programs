package Collection_Framework;
import java.util.HashSet;
import java.util.Set;


public class SetC
{
    public static void main(String[] args)
    {
        Set fruits=new HashSet();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("Pineapple");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.contains("apple"));
    }
}
