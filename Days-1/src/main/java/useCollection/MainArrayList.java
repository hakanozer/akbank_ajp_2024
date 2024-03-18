package useCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainArrayList {

    public static void main(String[] args) {

        // Normal Dizi
        String[] arr = {"a", "b", "c"};

        // Collection -> ArrayList
        ArrayList<String> lsx = new ArrayList();
        List<String> ls = new ArrayList<>();

        // new add item
        ls.add("İstanbul");
        ls.add("Ankara");
        ls.add("İzmir");
        ls.add("Samsun");
        ls.add("Bursa");

        // remove item
        // ls.remove("Ankara");
        // ls.remove(1);
        // ls.clear();

        boolean containsStatus =  ls.contains("İzmir");
        System.out.println(containsStatus);

        // indexof
        int index = ls.indexOf("İzmirx");
        System.out.println(index);
        if (index > -1) {
            ls.set(index, "Antalya");
        }





        System.out.println(ls);
    }

    public static void call(List<String> ls) {

    }

}
