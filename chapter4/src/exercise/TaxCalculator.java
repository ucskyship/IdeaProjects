package exercise;

public class TaxCalculator {
    private int tax;
    public int taxPercentage(int earning) {
        if (earning > 0 && earning <= 30000){
            tax = earning * 15 / 100;
        }
        if (earning > 30000){
            tax = earning * 20 / 100;
        }
        return tax;
    }
}
