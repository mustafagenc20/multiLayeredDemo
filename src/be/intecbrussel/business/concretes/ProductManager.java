package be.intecbrussel.business.concretes;

import be.intecbrussel.business.abstracts.ProductService;
import be.intecbrussel.dataAccess.abstracts.ProductDao;
import be.intecbrussel.dataAccess.concretes.HibernateProductDao;
import be.intecbrussel.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId() == 1){
            System.out.println("Product is not accepting in this category.");
            return;
        }
        this.productDao.add(product);
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
