package taxes;

public class USNDebitMinusCredit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) ((debit - credit) * 0.15);
        if (tax < 0) {
            tax = 0;
        }
        return tax;
    }
}