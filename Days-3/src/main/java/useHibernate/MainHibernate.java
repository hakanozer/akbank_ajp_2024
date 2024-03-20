package useHibernate;

import useHibernate.entities.Product;

import java.util.List;

public class MainHibernate {
    public static void main(String[] args) {

        ProductService productService = new ProductService();
        /*
        Product product = new Product();
        product.setTitle("iPhone");
        product.setPrice(50000);
        product.setDetail("iPhone Detail");
        productService.productAdd(product);
         */
        List<Product> ls = productService.allProduct();
        for(Product item : ls) {
            System.out.println(item.getTitle() + " - " + item.getPrice());
        }
    }
}
