package Chain_Responsibilities;

abstract class OrderHandler {
    protected OrderHandler nextHandler;
    protected String handlerName;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void processOrder(Order order) {
        if (canHandle(order)) {
            handleOrder(order);
        }

        if (nextHandler != null) {
            nextHandler.processOrder(order);
        }
    }

    protected abstract boolean canHandle(Order order);
    protected abstract void handleOrder(Order order);
}