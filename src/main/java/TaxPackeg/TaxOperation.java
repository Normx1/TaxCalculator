package TaxPackeg;

public class TaxOperation {
    private double profit;
    private double baseValue;


    public TaxOperation(double profit, double baseValue) {
        this.profit = profit;
        this.baseValue = baseValue;
    }

    public double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }


    public double getProfit() {
        return profit;
    }


    public Double taxPayment() {
        TaxOperation salary = new TaxOperation(getProfit(), getBaseValue());
        Double tax = 0.0;
        Double profit = salary.getProfit();
        Double baseValue = salary.getBaseValue();
        while (profit > 0) {
            if (profit - 1080 * baseValue > 0) {
                tax = (profit - 1080 * baseValue) * 0.3;
                profit = 1080 * baseValue;
            }
            if (profit - 1080 * baseValue <= 0 & profit - 840 * baseValue > 0) {
                tax = tax + (profit - 840 * baseValue) * 0.25;
                profit = 840 * baseValue;

            }
            if (profit - 840 * baseValue <= 0 & profit - 600 * baseValue > 0) {
                tax = tax + (profit - 600 * baseValue) * 0.2;
                profit = 600 * baseValue;

            }
            if (profit - 600 * baseValue <= 0 & profit - 240 * baseValue > 0) {
                tax = tax + (profit - 240 * baseValue) * 0.15;
                profit = 240 * baseValue;

            }
            if (profit - 240 * baseValue <= 0 & profit / baseValue > 0) {
                tax = tax + profit * 0.09;

            }
            break;
        }
        return tax;
    }
}