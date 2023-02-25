package lk.ijse.hiberanate.util;

import lk.ijse.hiberanate.entity.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryConfiguaration {

    private static SessionFactoryConfiguaration factoryConfiguaration;

    public static SessionFactoryConfiguaration getInstance(){
         return (null==factoryConfiguaration) ? factoryConfiguaration=new SessionFactoryConfiguaration() :factoryConfiguaration;
    }

    public Session getSession() throws HibernateException {
        //

        SessionFactory sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).addAnnotatedClass(Customer.class).getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE).build().getSessionFactoryBuilder().build();

        return sessionFactory.openSession();
    }
}

