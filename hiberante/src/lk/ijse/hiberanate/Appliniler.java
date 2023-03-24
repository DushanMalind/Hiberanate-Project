package lk.ijse.hiberanate;

import lk.ijse.hiberanate.embedded.CusName;
import lk.ijse.hiberanate.embedded.MobilNumber;
import lk.ijse.hiberanate.entity.Customer;

import lk.ijse.hiberanate.projection.CustomerDetailDto;
import lk.ijse.hiberanate.repository.CustomerRepository;
import lk.ijse.hiberanate.util.SessionFactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Appliniler {
    public static void main(String[] args) {


        Session session = SessionFactoryConfiguaration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

       /* Customer customer1=new Customer();
        customer1.setId(1L);
        customer1.setName("Kamal");
        customer1.setAddress("Galle");
        customer1.setAge(10);



        session.save(customer1);
        transaction.commit();
        session.close();*/

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

        CustomerRepository customerRepository=new CustomerRepository();
        Customer customer=getCustomerEntity();

        customerRepository.saveCustomer(customer);

        customerRepository = new CustomerRepository();
        List<Customer> customers = customerRepository.getAllCustomers();
        for (Customer customer1 : customers) {
            System.out.println(customer1);
        }

        customerRepository = new CustomerRepository();
        List<Customer> jpqlCustomers = customerRepository.getAllJPQLCustomers();
        for (Customer customer1 : jpqlCustomers) {
            System.out.println(customer1);
        }

        // Now this Projection works. Please refer the CustomerRepository
        customerRepository = new CustomerRepository();
        List<CustomerDetailDto> jpqlCustomerProj = customerRepository.getAllCustomerProjection();
        for (CustomerDetailDto customer1 : jpqlCustomerProj) {
            System.out.println(customer1);
        }

    }
    private static Customer getCustomerEntity() {
        Customer customer = new Customer();
        // Sets Customer table's primary key
        customer.setId(1L);

        // Defines the NameIdentifier - Embeddable object data
        CusName nameIdentifier = new CusName();
        nameIdentifier.setFirstName("Saman");
        nameIdentifier.setMiddleName("Perera");
        nameIdentifier.setLastName("SurName");
        customer.setName(String.valueOf(nameIdentifier));

        // Sets the NameIdentifier object data as Name in Customer Entity
//        customer.setName(nameIdentifier);

        // Sets the customer address
        customer.setAddress("Galle");
        // Sets the customer salary
//        customer.setSalary(30000.00);
        // Sets the customer age
        customer.setAge(22);


        // Defines a List of MobileNo - Embeddable object data
        List<MobilNumber> phoneNos = new ArrayList<>();
        phoneNos.add(new MobilNumber("MOBILE", "07763483457"));
        phoneNos.add(new MobilNumber("HOME", "0918475834758"));
        // Sets the defined List of MobileNo - Embeddable objects
        // as PhoneNos in Customer Entity
//        customer.setPhoneNos(phoneNos);


        return customer;
    }
}
