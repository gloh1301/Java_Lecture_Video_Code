package week_3_methods;

import static input.InputUtils.doubleInput;

public class MPG {
    public static void main(String[] args) {
        double miles = doubleInput("Enter miles driven: ");
        double gas = doubleInput("Enter gallons of gas used: ");

        double mpg = milesPerGallon(miles, gas);
        System.out.println("The MPG for this trip is " + mpg + " miles per gallon.");
    }

    public static double milesPerGallon(double miles, double gallonsOfGas) {
        double mpg = miles / gallonsOfGas;
        return mpg;
    }
}
