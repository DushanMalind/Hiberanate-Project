package lk.ijse.hiberanate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDeatilsPK {
    @Column(name = "order-Id")
    private long orderId;

    @Column(name = "item_id")
    private long itemId;
}
