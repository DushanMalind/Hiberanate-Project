package lk.ijse.hiberanate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @Column(name = "item_code")
    private long code;
    @Column(name = "item_description")
    private String description;
    @Column(name = "item_Quantity")
    private int qty;
    @Column(name = "item_unitprice")
    private double unitPrice;

   /* @ManyToMany(mappedBy = "itemList")
    List<Orders>ordersList=new ArrayList<>();

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }*/



    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "item")
    private List<OrderDeatils>orderDeatilsList=new ArrayList<>();

    public List<OrderDeatils> getOrderDeatilsList() {
        return orderDeatilsList;
    }

    public void setOrderDeatilsList(List<OrderDeatils> orderDeatilsList) {
        this.orderDeatilsList = orderDeatilsList;
    }


    public Item() {
    }

    public Item(long code, String description, int qty, double unitPrice) {
        this.code = code;
        this.description = description;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
