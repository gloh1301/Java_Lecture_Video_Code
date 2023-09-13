package week_2_loops;

public class ForLoops {
    public static void main(String[] args) {
        // print 1 to 5
        for (int x = 1; x <= 5; x++) {
            System.out.println(x);
        }

        // print 10 to 0
        for (int x = 10; x >= 0; x = x-1) {
            System.out.println(x + "...");
        }
        System.out.println("Rocket Launch!!");
    }
}
