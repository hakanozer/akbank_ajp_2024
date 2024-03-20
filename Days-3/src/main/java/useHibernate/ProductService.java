package useHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import useHibernate.entities.Product;

public class ProductService {

    SessionFactory sf = HibernateUtil.getSessionFactory();

    public void productAdd(Product product) {
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();

        session.persist(product);

        tr.commit();
        session.close();

    }

}
