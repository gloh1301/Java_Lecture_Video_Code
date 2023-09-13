package week_2_loops;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {

        // final int NUMBER_OF_DAYS = 7;

        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double total = 0;

        for (int day = 0; day < dayNames.length; day++) {
            String dayName = dayNames[day];
            double amountSpent = doubleInput("What did you spend on bus fare for day " + dayName);
            total = total + amountSpent;
        }
        System.out.println("Total spent this week $" + total);
    }
}
