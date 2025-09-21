package Chain_Responsibilities;

import java.util.List;

public class Order {
    private String orderId;
    private double price;
    private boolean status;

    public Order(String orderId, double price, boolean status) {
        this.orderId = orderId;
        this.price = price;
        this.status = status;
    }

    public String getOrderId() { return orderId; }
    public double getAmount() { return price; }
    public boolean getStatus() { return status; }
}
