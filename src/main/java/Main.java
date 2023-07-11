import taxes.USNDebitMinusCredit;
import taxes.USNEarnings;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Пятерочка", new USNEarnings());
        company.setTaxSystem(new USNDebitMinusCredit());

        Deal[] deals = {
                new Sale(100, "хлеб"),
                new Expenditure(50, "лампочка"),
                new Sale(50, "масло")
        };
        company.applyDeals(deals);
        //company.payTaxes();
        System.out.println("Разница доходов и расходов до налогов " + company.dif);
    }
}