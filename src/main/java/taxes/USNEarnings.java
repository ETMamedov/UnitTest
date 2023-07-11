package taxes;

public class USNEarnings extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) (debit * 0.06);
        return tax;
    }
}