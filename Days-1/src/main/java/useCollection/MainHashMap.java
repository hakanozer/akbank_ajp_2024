package useCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainHashMap {
    public static void main(String[] args) {

        // HashMap<String, Object> hm = new HashMap<>();
        Map<String, Object> hm = new HashMap<>();

        // item add
        hm.put("uid", 100);
        hm.put("uid", 110);
        hm.put("name", "Ali");
        hm.put("surname", "Bilmem");
        hm.put("status", true);
        hm.put("age", 30);

        // single get item value
        System.out.println( hm.get("uid") );

        // All keys
        Set<String> keys = hm.keySet();
        for(String key : keys) {
            System.out.println( key +" - "+ hm.get(key) );
        }

        System.out.println("======================");
        hm.forEach( (key, val) -> {
            System.out.println( key +" - "+ val );
        });
        // hm.values();

        //hm.remove("age");
        //hm.clear();
        hm.remove("agex");

        Object age = hm.getOrDefault("agex", 100);
        System.out.println(age);

        hm.replace("uid", 111);

        System.out.println(hm);
    }
}
