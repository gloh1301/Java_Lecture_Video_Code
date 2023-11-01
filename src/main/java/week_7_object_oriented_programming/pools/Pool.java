package week_7_object_oriented_programming.pools;

public class Pool {
    private String name;
    private double length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Pool(String poolName, double poolLength) {
        this.name = poolName;
        this.length = poolLength;
    }

    public double distanceForLaps(int laps) {
        // 10 laps by 50 length is 500
        double total = laps * this.length;
        return total;
    }

    @Override
    public String toString() {
        String description = this.name + " pool is " + this.length + " meters long";
        return description;
    }
}
