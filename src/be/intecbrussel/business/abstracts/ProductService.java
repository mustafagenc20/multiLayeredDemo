package be.intecbrussel.business.abstracts;

import be.intecbrussel.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
