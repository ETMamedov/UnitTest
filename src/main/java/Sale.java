public class Sale extends Deal {
    public int price;
    private String name;

    public Sale(int price, String name) {
        super("Продажа " + name + " на " + price + " руб.", price, 0);
    }
}