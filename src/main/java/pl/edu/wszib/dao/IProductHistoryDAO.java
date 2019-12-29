package pl.edu.wszib.dao;

import pl.edu.wszib.model.ProductHistory;

public interface IProductHistoryDAO {
    void persistProductHistory(ProductHistory productHistory);
    ProductHistory getProductHistoryByProductId(int id);
}
