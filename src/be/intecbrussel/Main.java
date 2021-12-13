package be.intecbrussel;

import be.intecbrussel.business.abstracts.ProductService;
import be.intecbrussel.business.concretes.ProductManager;
import be.intecbrussel.dataAccess.concretes.AbcProductDao;
import be.intecbrussel.dataAccess.concretes.HibernateProductDao;
import be.intecbrussel.entities.concretes.Product;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductManager(new AbcProductDao());
        Product product = new Product(1, 2, "Apple", 12, 50);
        productService.add(product);
    }
}
