package JavaCollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBasic {
    void main () {
        Map<String, String> mapping = new HashMap();

//        insertion
        mapping.put("in", "India");
//        mapping.put("in", "India");
        mapping.put("us", "United States");
        mapping.put("en", "England");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "brazil");
        table.putAll(mapping);
        System.out.println(table);

//        Deletion
        table.remove("en");
        System.out.println(table);

        System.out.println(table.size());

//        System.out.println(table);
//        table.putIfAbsent("is", "India3");
//        System.out.println(table);
        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("usa", "none"));

        System.out.println(table.containsKey("ins"));
        System.out.println(table.containsValue("India"));

        System.out.println("table: " + table);
        table.replace("in", "indonesia");
        System.out.println(table);

        Set<String> st = table.keySet();
        System.out.println(st);

        Collection<String> vl = table.values();
        System.out.println(vl);

//        get all the entries form map

        Set<Map.Entry<String, String>> entrySet =  table.entrySet();
        System.out.println("Print entries: " + entrySet);















//        table.clear();
//        System.out.println(table.size());

    }
}
