package lk.ijse.hiberanate;

import lk.ijse.hiberanate.entity.Customer;
import lk.ijse.hiberanate.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TransientState {

    public static void main(String[] args) {


        Session session= SessionFactoryConfiguaration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

        //Transaction state
        Customer customer=new Customer();
        customer.setAddress("Transients");

        transaction.commit();
        session.close();
    }
}
