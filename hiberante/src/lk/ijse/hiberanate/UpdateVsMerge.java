package lk.ijse.hiberanate;

import lk.ijse.hiberanate.entity.Customer;
import lk.ijse.hiberanate.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateVsMerge {
    public static void main(String[] args) {

        Session session = SessionFactoryConfiguaration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        Customer customer = session.get(Customer.class, 3L);
        Customer customer = new Customer();
        customer.setId(3);
        customer.setAddress("galle");
//        session.update(customer);
        session.merge(customer);
        transaction.commit();
        session.close();
    }
}
