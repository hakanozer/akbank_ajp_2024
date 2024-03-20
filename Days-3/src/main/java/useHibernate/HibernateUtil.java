package useHibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration conf = new Configuration();
            SessionFactory sessionFactory1 = conf.configure("hibernate.cfg.xml").buildSessionFactory();
            return sessionFactory1;
        }catch (Exception ex) {
            System.err.println("SessionFactory Error:" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
