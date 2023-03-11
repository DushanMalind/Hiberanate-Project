package lk.ijse.hiberanate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;

@Embeddable
public class OrderDeatilsPK implements Serializable {
    @Column(name = "order-Id")
    private long orderId;

    @Column(name = "item_id")
    private long itemId;
}
