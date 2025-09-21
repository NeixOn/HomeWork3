package Chain_Responsibilities;

public class BonusOrderHandler extends OrderHandler{
    @Override
    protected boolean canHandle(Order order) {
        return true;
    }

    @Override
    protected void handleOrder(Order order) {
        if(order.getAmount() > 10000){
            System.out.println("Дорогой заказ, будет бонус!");
        }
        else{
            System.out.println("Заказ без бонуса, так как дешевый");
        }
    }
}
