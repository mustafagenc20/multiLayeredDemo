package be.intecbrussel;

import be.intecbrussel.business.abstracts.ProductService;
import be.intecbrussel.business.concretes.ProductManager;
import be.intecbrussel.core.JLoggerManagerAdapter;
import be.intecbrussel.dataAccess.concretes.AbcProductDao;
import be.intecbrussel.dataAccess.concretes.HibernateProductDao;
import be.intecbrussel.entities.concretes.Product;
import be.intecbrussel.jLogger.JLoggerManager;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
        Product product = new Product(1, 2, "Apple", 12, 50);
        productService.add(product);
    }
}
