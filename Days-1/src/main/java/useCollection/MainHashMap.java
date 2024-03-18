package useCollection;

import java.util.*;

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

        // Enum HashMap
        Map<EApp, Object> ehm = new HashMap<>();
        ehm.put(EApp.uid, 200);
        ehm.put(EApp.email, "ali@mail.com");
        ehm.put(EApp.password, "12345");
        ehm.put(EApp.status, true);

        Map<EApp, Object> ehm1 = new HashMap<>();
        ehm1.put(EApp.uid, 201);
        ehm1.put(EApp.email, "erkan@mail.com");
        ehm1.put(EApp.password, "12345");
        ehm1.put(EApp.status, false);

        // Get item
        System.out.println( ehm.get(EApp.email) );
        //ehm.remove(EApp.status);

        // All keys
        Set<EApp> allKey = ehm.keySet();
        for(EApp key : allKey) {
            System.out.println(key);
        }
        System.out.println(ehm);

        List<Map<EApp, Object>> ls = new ArrayList<>();
        ls.add(ehm);
        ls.add(ehm1);

        for (Map<EApp, Object> item : ls) {
            System.out.println(item.get(EApp.email));
        }

        ls.forEach(item -> {
            System.out.println(item);
        });
    }


    public void call( EApp type ) {
        if(type == EApp.email) {

        }
    }

}
