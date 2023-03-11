package lk.ijse.hiberanate.entity;


import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDeatils {
    @Id
    @Column(name = "orderDeatils_id")
    private long id;
    @Column(name = "order_price")
    private double price;
    @Column(name = "order_qty")
    private int qty;



    @ManyToOne
    private Orders orders;
    @JoinColumn(name = "order_id",referencedColumnName = "order_id",insertable = false,updatable = false)

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }



    @ManyToOne
    @JoinColumn(name = "item_code",referencedColumnName = "item_code",insertable = false,updatable = false)
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }



    public OrderDeatils() {
    }

    public OrderDeatils(long id, double price, int qty) {
        this.id = id;
        this.price = price;
        this.qty = qty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrderDeatils{" +
                "id=" + id +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
