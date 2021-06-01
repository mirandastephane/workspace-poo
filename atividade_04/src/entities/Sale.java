package entities;

public class Sale {

    public double saleValue;

    public Sale(double seleValue) {
        this.saleValue = seleValue;
    }

    public double getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(double saleValue) {
        this.saleValue = saleValue;
    }

    @Override
    public String toString() {
        return "saleValue = R$ " + saleValue +"\n";
    }
}
