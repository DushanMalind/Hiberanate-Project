package lk.ijse.hiberanate;

import lk.ijse.hiberanate.embedded.CusName;
import lk.ijse.hiberanate.entity.Customer;
import lk.ijse.hiberanate.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DetatchState {

    public static void main(String[] args) {
        Session session= SessionFactoryConfiguaration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

        Customer customer=new Customer();//TransientState
        customer.setId(1L);
        customer.setAddress("Galle");
        customer.setSalary(52011);

        session.save(customer);

        CusName cusName=new CusName();
        cusName.setFirstName("1ka");
        cusName.setMiddleName("2dgg");
        cusName.setLastName("3ffg");
        customer.setName(cusName);

        System.out.println(customer);

        session.close();

        Session session2= SessionFactoryConfiguaration.getInstance().getSession();
        Transaction transaction1=session2.beginTransaction();

        session2.merge(customer);

        transaction1.commit();

        session2.close();

    }
}
