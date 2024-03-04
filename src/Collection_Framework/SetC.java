package Collection_Framework;
import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


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

        System.out.println("Print Tree set...");

        Set name=new TreeSet();
        name.add("Zahir");
        name.add("Amit");
        name.add("Nani");
        System.out.println(name);

    }
}
