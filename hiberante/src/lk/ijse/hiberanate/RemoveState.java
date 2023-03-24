package lk.ijse.hiberanate;

import lk.ijse.hiberanate.entity.Customer;
import lk.ijse.hiberanate.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RemoveState {
    public static void main(String[] args) {

        Session session= SessionFactoryConfiguaration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();


        Customer customer = session.get(Customer.class, 2L);//persistence state
        session.delete(customer);//remove State
        transaction.commit();
        session.close();
    }
}
