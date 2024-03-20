package useHibernate;

import useHibernate.entities.Product;

public class MainHibernate {
    public static void main(String[] args) {

        ProductService productService = new ProductService();
        Product product = new Product();
        product.setTitle("TV");
        product.setPrice(10000);
        product.setDetail("TV Detail");
        productService.productAdd(product);

    }
}
