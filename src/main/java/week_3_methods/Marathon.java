package week_3_methods;

public class Marathon {
    public static void main(String[] args) {

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10;

        marathonSchedule(currentDistance, targetDistance, percentIncrease);
    }

    public static void marathonSchedule(double currentDistance, double targetDistance, double percentIncrease) {
        int week = 1;

        // loop until current distance is greater than target distance
        while (currentDistance < targetDistance) {
            System.out.println(week + " " + currentDistance);
            currentDistance = currentDistance * percentIncrease;
            week++; // week count increase
        }
        // print one more line past loop
        System.out.println(week + " " + currentDistance);
    }
}
