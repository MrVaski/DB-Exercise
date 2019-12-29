package pl.edu.wszib.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import pl.edu.wszib.dao.IProductHistoryDAO;
import pl.edu.wszib.model.ProductHistory;

@Component
public class ProductHistoryDAOImpl implements IProductHistoryDAO {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void persistProductHistory(ProductHistory productHistory) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(productHistory);
            //wiecej operacji
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null) tx.rollback();
        } finally {
            session.close();
        }
    }

    public ProductHistory getProductHistoryByProductId(int id) {
        Session session = factory.openSession();
        ProductHistory productHistory = (ProductHistory) session
                .createQuery("FROM pl.edu.wszib.model.ProductHistory WHERE newProductId = " + id).uniqueResult();

        session.close();
        return productHistory;
    }
}
