package Chain_Responsibilities;

import java.util.List;

public class OrderProcessingSystem {
    private OrderHandler firstHandler;

    public OrderProcessingSystem() {
        setupHandlers();
    }

    private void setupHandlers() {
        OrderHandler paymentHandler = new PaymentValidationHandler();
        OrderHandler bonusHandler = new BonusOrderHandler();

        paymentHandler.setNextHandler(bonusHandler);

        firstHandler = paymentHandler;
    }

    public void processOrders(List<Order> orders) {
        System.out.println("=== Обработка заказов ===");
        for (Order order : orders) {
            System.out.println("\nОбработка заказа: " + order.getOrderId());
            firstHandler.processOrder(order);
        }
    }
}