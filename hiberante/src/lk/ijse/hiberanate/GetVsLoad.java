/*
package lk.ijse.hiberanate;

import lk.ijse.hiberanate.embedded.CusName;
import lk.ijse.hiberanate.embedded.MobilNumber;
import lk.ijse.hiberanate.entity.Customer;
import lk.ijse.hiberanate.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class GetVsLoad {
    public static void main(String[] args) {

    */
/*    Session session= SessionFactoryConfiguaration.getInstance().getSession();

        Transaction transaction= session.beginTransaction();

        Customer customer=getCustomerEntity();
        session.save(customer);
        transaction.commit();
        session.close();*//*



        System.out.println("------------get");

        Session session=SessionFactoryConfiguaration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

        Customer customer=session.get(Customer.class,3L);
        System.out.println("Customer ID"+customer.getId());
        System.out.println("Customer First Name"+customer.getName().getFirstName());
        System.out.println("Customer Last Name"+customer.getName().getLastName());
        System.out.println("Customer Address"+customer.getAddress());

        session.close();

        System.out.println("--------------load--------------");

        Session session1 = SessionFactoryConfiguaration.getInstance().getSession();

        Customer load=session1.load(Customer.class,3L);

        System.out.println("Customer ID"+load.getId());
        System.out.println("Customer First Name"+load.getName().getFirstName());
        System.out.println("Customer Last Name"+load.getName().getLastName());
        System.out.println("Customer Address"+load.getAddress());

        System.out.println();

        System.out.println(load);

        session.close();

    }

    private  static Customer getCustomerEntity(){
        Customer customer5 = new Customer();
        customer5.setId(1L);

        CusName cusName=new CusName();
        cusName.setFirstName("Dushan");
        cusName.setMiddleName("Malinda");
        cusName.setLastName("Max");
        customer5.setName(cusName);
        customer5.setAddress("galle");
        customer5.setSalary(30000.020);
        customer5.setAge(22);

        List<MobilNumber> phoneNumbers=new ArrayList<>();
        phoneNumbers.add(new MobilNumber("MOBILE","0771251314"));
        phoneNumbers.add(new MobilNumber("HOME","0912547891"));
        customer5.setPhoneNumbers(phoneNumbers);

        return customer5;

    }

}
*/
