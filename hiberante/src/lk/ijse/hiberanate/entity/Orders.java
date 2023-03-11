package lk.ijse.hiberanate.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @Column(name = "order_id")
    private long id;
    @Column(name = "order_date")
    private Timestamp orderDate;



    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer1 customer1;

    public Customer1 getCustomer1() {
        return customer1;
    }

    public void setCustomer1(Customer1 customer1) {
        this.customer1 = customer1;
    }

    public Orders() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
}
