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
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.util.Properties;

public class SessionFactoryConfiguaration {

    private static SessionFactoryConfiguaration factoryConfiguaration;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfiguaration(){

       /* Properties properties=new Properties();
        try {
            properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));
        }catch (Exception e){
            e.printStackTrace();
        }
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Customer.class);
        sessionFactory=configuration.mergeProperties(properties).buildSessionFactory();*/
//        sessionFactory=configuration.mergeProperties(properties).addResource("mapping/Customer.hbm.xml").buildSessionFactory();

        //addAnnotatedClass new Version
       /* Configuration configuration=new Configuration().configure().addAnnotatedClass(Customer.class);
        sessionFactory=configuration.buildSessionFactory();*/

       // addAnnotatedClass new Version short
        sessionFactory=new Configuration().configure().addAnnotatedClass(Customer.class).buildSessionFactory();


       // addAnnotatedClass old version
        /*sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).addAnnotatedClass(Customer.class).getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE).build().getSessionFactoryBuilder().build();*/


    }

    public static SessionFactoryConfiguaration getInstance(){
         return (null==factoryConfiguaration) ? factoryConfiguaration=new SessionFactoryConfiguaration() :factoryConfiguaration;
    }

    public Session getSession() throws HibernateException {

        return sessionFactory.openSession();
    }
}

