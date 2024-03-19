package json;

import java.util.List;

@lombok.Data
public class Products {
    private List<Product> products;
    private long total;
    private long skip;
    private long limit;
}