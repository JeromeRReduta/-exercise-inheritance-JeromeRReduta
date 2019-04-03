public class MonetaryCoin extends Coin {

    private double value;

    public MonetaryCoin(double value) {
        super();
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String toString() {
        return super.toString() + "\t" + this.value;
    }
}
