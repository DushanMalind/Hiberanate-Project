package lk.ijse.hiberanate.util;


import lk.ijse.hiberanate.entity.Customer;
import lk.ijse.hiberanate.entity.Item;
import lk.ijse.hiberanate.entity.OrderDeatils;
import lk.ijse.hiberanate.entity.Orders;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
        sessionFactory=new Configuration().configure()
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Orders.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(OrderDeatils.class).buildSessionFactory();


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

