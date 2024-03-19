package xml;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public List<Product> result() {
        List<Product> ls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product p = new Product();
            p.setPid(i);
            p.setTitle("Title - " + i);

            Category c = new Category();
            c.setCid(i*2);
            c.setName("Cat - " + i);

            p.setCategory(c);
            ls.add(p);
        }
        return ls;
    }

}
