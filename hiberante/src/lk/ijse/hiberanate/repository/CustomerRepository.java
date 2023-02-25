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
    
    public Integer saveCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
        Integer id = (Integer)session.save(customer);
        transaction.commit();

        return id;
    }
}
