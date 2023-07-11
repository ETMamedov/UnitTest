public class Expenditure extends Deal {
    public int price;
    public String name;

    public Expenditure(int price, String name) {
        super("Покупка" + name + " на " + price + " руб.", 0, price);
    }
}