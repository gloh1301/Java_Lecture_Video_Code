package week_3_methods;

import static input.InputUtils.intInput;

public class Count {
    public static void main(String[] args) {
        int smallNumber = intInput("Enter a small number: ");
        int largeNumber = intInput("Enter a large number: ");

        System.out.println("This program will count from " + smallNumber + " to " + largeNumber);

        count(smallNumber, largeNumber);
    }

    // returns nothing - return type void
    public static void count(int min, int max) {
        for (int x = min; x <= max; x++) {
            System.out.println(x);
        }
    }
}
