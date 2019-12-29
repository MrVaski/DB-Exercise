package pl.edu.wszib.dao;

import pl.edu.wszib.model.Product;

import java.util.List;

public interface IProductDAO {
    void persistProduct(Product product);
    Product getProductById(int productID);
    void deleteProduct(Product product);
    List<Product> getAllProducts();
}
