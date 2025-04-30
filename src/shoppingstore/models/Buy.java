package shoppingstore.models;

public class Buy implements Comparable<Buy>{
    private final double value;
    private final String description;


    public Buy(double value, String description) {
        this.value = value;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "\n" + description + " " + value;
    }

    @Override
    public int compareTo(Buy otherBuy) {
        return Double.compare(this.value, otherBuy.getValue());
    }
}
