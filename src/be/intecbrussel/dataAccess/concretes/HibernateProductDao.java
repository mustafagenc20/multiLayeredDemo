package be.intecbrussel.dataAccess.concretes;

import be.intecbrussel.dataAccess.abstracts.ProductDao;
import be.intecbrussel.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Product added with Hibernate" + product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
