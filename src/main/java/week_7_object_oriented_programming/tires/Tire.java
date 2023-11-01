package week_7_object_oriented_programming.tires;

public class Tire implements Comparable<Tire>{

    private String name;
    private double price;
    private int warrantyMiles;

    public Tire(String name, double price, int warrantyMiles) {
        this.name = name;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    public double pricePer1000Miles() {
        double pricePer1000 = (this.price / this.warrantyMiles) * 1000;
        return pricePer1000;
    }

    public double costPerSet() {
        return this.price * 4;
    }

    @Override
    public String toString() {
        double pricePer1000 = pricePer1000Miles();
        return String.format("%s costs $%.2f per tire. Cost per 1000 miles $%.2f. ", this.name, this.price, pricePer1000);
    }

    @Override
    public int compareTo(Tire anotherTire) {
        // compare by price
        // return Double.compare(this.pricePer1000Miles(), anotherTire.pricePer1000Miles());
        // compare by name
        return this.name.compareTo(anotherTire.name);
    }
}
