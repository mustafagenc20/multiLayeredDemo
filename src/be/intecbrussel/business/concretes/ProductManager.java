package be.intecbrussel.business.concretes;

import be.intecbrussel.business.abstracts.ProductService;
import be.intecbrussel.core.LoggerService;
import be.intecbrussel.dataAccess.abstracts.ProductDao;
import be.intecbrussel.dataAccess.concretes.HibernateProductDao;
import be.intecbrussel.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId() == 1){
            System.out.println("Product is not accepting in this category.");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Product added: " + product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
