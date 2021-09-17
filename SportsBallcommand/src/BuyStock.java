public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock ballsStock){
        this.abcStock = ballsStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
