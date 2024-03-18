package useCollection;

import java.text.Collator;
import java.util.*;

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
        ls.add("İzmir");
        ls.add("Zonguldak");
        ls.add("Zonguldak");
        ls.add("Zonguldak");
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

        // get item
        String item = ls.get(0);
        System.out.println(item);

        // size
        int size = ls.size();
        System.out.println(size);

        for (int i = 0; i < ls.size(); i++) {
            System.out.println( ls.get(i) );
        }

        System.out.println("=================");
        for (String itemx : ls) {
            System.out.println(itemx);
        }

        System.out.println("================= - iter -1");
        ListIterator<String> iterator = ls.listIterator();
        while (iterator.hasNext()) {
            System.out.println( iterator.next() );
        }

        System.out.println("================= - iter -2");
        while (iterator.hasNext()) {
            System.out.println( iterator.next() );
        }

        System.out.println(ls);

        // sort
        Locale trLcale = new Locale("tr_TR");
        Collator collator = Collator.getInstance(trLcale);
        Collections.sort(ls, collator);
        Collections.reverse(ls);

        System.out.println(ls);
    }

    public static void call(List<String> ls) {

    }

}
