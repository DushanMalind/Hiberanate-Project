package lk.ijse.hiberanate.repository;

import lk.ijse.hiberanate.entity.Customer;
import lk.ijse.hiberanate.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;

public class CustomerRepository {
    
    private final Session session;
    
    public CustomerRepository(){
        session= SessionFactoryConfiguaration.getInstance().getSession();
    }
    
    public Long saveCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();

        try {
            Long id = (Long)session.save(customer);
            transaction.commit();
            session.close();
            return id;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return -1L;
        }


    }

    public boolean updateCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();

        try {
            session.update(customer);
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return false;
        }

    }
}
