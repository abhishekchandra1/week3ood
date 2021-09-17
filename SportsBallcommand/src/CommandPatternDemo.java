public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock ballsStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(ballsStock);
        SellStock sellStockOrder = new SellStock(ballsStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
