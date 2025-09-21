package Chain_Responsibilities;

public class PaymentValidationHandler extends OrderHandler {

    @Override
    protected boolean canHandle(Order order) {
        return true; // Все заказы проходят проверку платежа
    }

    @Override
    protected void handleOrder(Order order) {
        if(order.getStatus()){
            System.out.println("Заказ оплачен");
        }
        else{
            System.out.println("Заказ не оплачен!");
        }
    }
}
