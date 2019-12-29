package pl.edu.wszib.services.impl;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import pl.edu.wszib.dao.IProductDAO;
import pl.edu.wszib.dao.IProductHistoryDAO;
import pl.edu.wszib.model.Product;
import pl.edu.wszib.model.ProductHistory;
import pl.edu.wszib.services.IProductService;

import java.util.Date;

@Component
public class ProductServiceImpl implements IProductService {

@Autowired
    IProductDAO productDAO;
@Autowired
    IProductHistoryDAO productHistoryDAO;

    public void saveProduct(Product product) {
        productDAO.persistProduct(product);
        ProductHistory productHistory = new ProductHistory();
        productHistory.setDate(new Date());
        productHistory.setNewProductId(product.getProductID());

        productHistoryDAO.persistProductHistory(productHistory);
    }
}
