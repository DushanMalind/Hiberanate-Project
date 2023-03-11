package lk.ijse.hiberanate;

import lk.ijse.hiberanate.embedded.CusName;
import lk.ijse.hiberanate.embedded.MobilNumber;

import lk.ijse.hiberanate.entity.Customer1;
import lk.ijse.hiberanate.repository.CustomerRepository;
import lk.ijse.hiberanate.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Appliniler {
    public static void main(String[] args) {

       /* CustomerRepository customerRepository=new CustomerRepository();
        Customer customer1=getCustomerEntity();
        customerRepository.saveCustomer(customer1);


        CustomerRepository customerRepository1=new CustomerRepository();
        Customer customer2=customerRepository1.getCustomer(1L);
        System.out.println("Cutomer id"+customer2.getId());

        customer1.setAddress("Jfnana");

        boolean isUpdate = customerRepository1.updateCustomer(customer1);
        if (isUpdate){
            System.out.println("Customer"+customer1.getId()+"Update SusccFully");
        }else {
            System.out.println("Customer"+customer1.getId()+"Update not");
        }
        Customer customer = new Customer();

        customer.setId(1L);

        CusName cusName=new CusName();
        cusName.setFirstName("Dushan");
        cusName.setMiddleName("Malinda");
        cusName.setLastName("Max");
        customer.setName(cusName);
        customer.setAddress("galle");
        customer.setSalary(30000.020);
        customer.setAge(22);

        List<MobilNumber> phoneNumbers=new ArrayList<>();
        phoneNumbers.add(new MobilNumber("MOBILE","0771251314"));
        phoneNumbers.add(new MobilNumber("HOME","0912547891"));
        customer.setPhoneNumbers(phoneNumbers);

        *//*customer.setId(2L);
        customer.setName("Kamal");
        customer.setAddress("mathara");
        customer.setSalary(4000.023);

        customer.setId(3L);
        customer.setName("nimal");
        customer.setAddress("batapola");
        customer.setSalary(20000.124);*//*
        Session session=SessionFactoryConfiguaration.getInstance().getSession();
        session.save(customer);
        Transaction transaction= session.beginTransaction();
        transaction.commit();
        session.close();

        CustomerRepository customerRepository3=new CustomerRepository();
        Customer customer3=getCustomerEntity();
        customerRepository3.delteCustomer(customer3);

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

    }*/

        Session session = SessionFactoryConfiguaration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

        Customer1 customer1=new Customer1();
        customer1.setId(1L);
        customer1.setName("Kamal");
        customer1.setAddress("Galle");
        customer1.setAge(10);

        session.save(customer1);
        transaction.commit();
        session.close();
    }
}
