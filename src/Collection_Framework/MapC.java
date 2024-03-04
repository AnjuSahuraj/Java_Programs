package Collection_Framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapC
{
    public static void main(String[] args)
    {
        //Map<String,Integer> map=new TreeMap<>();
        //Map<String,Integer> map=new LinkedHashMap<>();
        Map<String,Integer> map=new HashMap<>();
        map.put("id",1);
        map.put("id1",23);
        map.put("id2",45);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("id2"));
        System.out.println(map.containsKey("id"));
        System.out.println(map.containsValue(66));
        System.out.println(map.keySet());

        for(Map.Entry<String,Integer> item:map.entrySet())
        {
            System.out.println(item.getKey()+"->"+item.getValue());
        }
    }
}
