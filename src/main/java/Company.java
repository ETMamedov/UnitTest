import taxes.TaxSystem;


public class Company {
    protected String title;
    protected int debit = 0;
    protected int credit = 0;
    protected TaxSystem taxSystem;
    protected int dif;
    protected int t;


    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    int applyDeals(Deal[] deals) {
        for (int i = 0; i < deals.length; i++) {
            Deal deal = deals[i];
            debit += deal.debitChange;
            credit += deal.creditChange;
            dif = debit - credit;
        }
//        System.out.println(debit);
        int t = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + t + " руб.");
        return dif;
    }

}