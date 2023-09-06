package week_1_if_else;

import static input.InputUtils.doubleInput;

public class Temp {
    public static void main(String[] args) {
        double tempYesterday = 100;
        double tempToday = doubleInput("What is the temperature today? ");

        if (tempYesterday > tempToday) {
            System.out.println("Yesterday was warmer");
        } else {
            System.out.println("Today is warmer");
        }
    }
}
