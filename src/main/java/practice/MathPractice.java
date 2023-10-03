package practice;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;
import java.lang.Math;
import java.util.Random;


public class MathPractice {
    public static void main(String[] args) {
        int songLength = 3;
        int songLengthInSeconds = songLength * 60;
        System.out.println("A " + songLength + " minute song is " + songLengthInSeconds + " seconds.");

        int secondsInADay = 24 * 60 * 60;
        System.out.println("There are " + secondsInADay + " seconds in a day.");

        int sideOfSquare = intInput("Enter length for side of a square: ");
        int areaOfSquare = sideOfSquare * 2;
        System.out.println("The area of a square with side length of " + sideOfSquare + " has an area of " + areaOfSquare);

        double miles = doubleInput("How many miles would you like to convert to kilometers? ");
        double milesToKilometers = miles * 1.6;
        double kilometers = doubleInput("How many kilometers would you like to convert to miles? ");
        double kilometersToMiles = kilometers * .6;
        System.out.println(miles + " miles is equal to " + milesToKilometers + " kilometers");
        System.out.println(kilometers + " kilometers is equal to " + kilometersToMiles + " miles");

        double salesTax = .05;
        double inverseSalesTax = 1 - salesTax;
        double itemPrice = 1.5;
        double itemPriceBeforeTax = itemPrice * inverseSalesTax;
        System.out.println(itemPriceBeforeTax);

        // even or odd
        int userNumber = intInput("Enter a number: ");
        if (userNumber % 2 == 0) {
            System.out.println(userNumber + " is even");
        } else {
            System.out.println(userNumber + " is odd");
        }

        // can number be evenly divided by 10
        int userNumber10 = intInput("Enter a number: ");
        if (userNumber10 % 10 == 0) {
            System.out.println(userNumber10 + " can be evenly divided by 10");
        } else {
            System.out.println(userNumber10 + " cannot be evenly divided by 10");
        }

        System.out.println(Math.PI);

        Random random = new Random();
        int randomNumberBetween1and10 = random.nextInt(10) + 1;
        System.out.println("Random number between 1 and 10: " + randomNumberBetween1and10);

        int randomNumberBetween0and1000 = random.nextInt(1001);
        System.out.println("Random number between 0 and 1000: " + randomNumberBetween0and1000);
    }
}
