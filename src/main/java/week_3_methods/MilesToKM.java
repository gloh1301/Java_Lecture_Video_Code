package week_3_methods;

import static input.InputUtils.doubleInput;

public class MilesToKM {
    public static void main(String[] args) {
        double miles = doubleInput("Enter number of miles: ");
        double km = milesToKM(miles);
        System.out.println(miles + " miles equals " + km + " kilometers");
    }

    private static double milesToKM(double miles) {
        double km = miles * 1.6;
        return km;
    }
}
