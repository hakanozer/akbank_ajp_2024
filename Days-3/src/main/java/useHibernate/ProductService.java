package useHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import useHibernate.entities.Product;

import java.util.List;

public class ProductService {

    SessionFactory sf = HibernateUtil.getSessionFactory();

    public void productAdd(Product product) {
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        session.persist(product); // insert
        tr.commit();
        session.close();
    }

    public List<Product> allProduct() {
        Session sesi = sf.openSession();
        List<Product> ls = sesi.createQuery("from Product").getResultList();
        sesi.close();
        return ls;
    }


}
