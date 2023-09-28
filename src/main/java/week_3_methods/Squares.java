package week_3_methods;

import static input.InputUtils.doubleInput;

public class Squares {
    public static void main(String[] args) {
        double number = doubleInput("Enter a number to be squared: ");
        double squared = square(number);
        System.out.println("The square of " + number + " is " + squared);
    }

//    public static void square(double n) {
//        double sq = n * n;
//        System.out.println("The square of " + n + " is " + sq);
//    }

    public static double square(double n) {
        double sq = n * n;
        return sq;
    }
}
