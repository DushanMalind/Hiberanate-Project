package lk.ijse.hiberanate.entity;

import lk.ijse.hiberanate.embedded.CusName;
import lk.ijse.hiberanate.embedded.MobilNumber;

import javax.persistence.*;
import java.util.List;


@Entity
//@Entity(name="Customer")
@Table(name="Customer")
public class Customer {
    @Id
    @Column(name = "Customer_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
//    @Column(name = "Customer_name")
    private CusName name;
    @Column(name = "Customer_address")
    private String address;
    @Column(name = "Customer_salary")
    private double salary;

    @Column(name ="Customer_age",columnDefinition = "SMALLINT")
    private int age;

    @CollectionTable(name = "Customer_mobil_nos",joinColumns = @JoinColumn(name = "Customer_id"))
    private List<MobilNumber> phoneNumbers;

    public Customer() {
    }

    public Customer(long id, CusName name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CusName getName() {
        return name;
    }

    public void setName(CusName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
