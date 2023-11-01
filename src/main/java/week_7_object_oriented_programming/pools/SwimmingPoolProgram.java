package week_7_object_oriented_programming.pools;

public class SwimmingPoolProgram {
    public static void main(String[] args) {
        Pool ymca = new Pool("YMCA", 50);
        Pool como = new Pool("Como Park", 25);
        Pool edina = new Pool("Edina", 50);
        double totalSwam = ymca.distanceForLaps(6);
        System.out.println("The total distance swam is " + totalSwam + " meters");
        System.out.println("The total distance swam in Edina pool is " + edina.distanceForLaps(12) + " meters");
        System.out.println(como.distanceForLaps(12));

        System.out.println(ymca);
        System.out.println(edina);
    }
}
