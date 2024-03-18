package useCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainHashSet {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("İstanbul");
        hashSet.add("Ankara");
        hashSet.add("İzmir");
        hashSet.add("İzmir");
        hashSet.add("Zonguldak");
        hashSet.add("Zonguldak");
        hashSet.add("Zonguldak");
        hashSet.add("Samsun");
        hashSet.add("Bursa");
        System.out.println(hashSet);

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("İstanbul");
        linkedSet.add("Ankara");
        linkedSet.add("İzmir");
        linkedSet.add("İzmir");
        linkedSet.add("Zonguldak");
        linkedSet.add("Zonguldak");
        linkedSet.add("Zonguldak");
        linkedSet.add("Samsun");
        linkedSet.add("Bursa");
        System.out.println(linkedSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("İstanbul");
        treeSet.add("Ankara");
        treeSet.add("İzmir");
        treeSet.add("İzmir");
        treeSet.add("Zonguldak");
        treeSet.add("Zonguldak");
        treeSet.add("Zonguldak");
        treeSet.add("Samsun");
        treeSet.add("Bursa");
        System.out.println(treeSet);


        // Property using
        User u1 = new User(100, "ali01", "12345");
        User u2 = new User(101, "ahmet01", "12345");
        User u3 = new User(102,"zehra01", "12345");
        User u4 = new User(103,"veli01", "12345");
        User u5 = new User(103,"veli01", "12345");

        Set<User> sets = new HashSet<>();
        sets.add(u1);
        sets.add(u2);
        sets.add(u2);
        sets.add(u2);
        sets.add(u3);
        sets.add(u3);
        sets.add(u4);
        sets.add(u5);

        for(User item : sets) {
            System.out.println(item.getUsername());
        }

    }
}
