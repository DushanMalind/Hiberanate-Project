package lk.ijse.hiberanate;

import lk.ijse.hiberanate.embedded.CusName;
import lk.ijse.hiberanate.entity.Customer;
import lk.ijse.hiberanate.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Appliniler {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1L);

        CusName cusName=new CusName();
        cusName.setFirstName("Dushan");
        cusName.setMiddleName("Malinda");
        cusName.setLastName("Max");
        customer.setName(cusName);
        customer.setAddress("galle");
        customer.setSalary(30000.020);

        /*customer.setId(2L);
        customer.setName("Kamal");
        customer.setAddress("mathara");
        customer.setSalary(4000.023);

        customer.setId(3L);
        customer.setName("nimal");
        customer.setAddress("batapola");
        customer.setSalary(20000.124);*/

        Session session=SessionFactoryConfiguaration.getInstance().getSession();
        session.save(customer);
        Transaction transaction= session.beginTransaction();
        transaction.commit();
        session.close();
    }
}
