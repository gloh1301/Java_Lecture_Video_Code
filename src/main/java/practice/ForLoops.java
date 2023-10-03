package practice;

import java.util.Random;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class ForLoops {
    public static void main(String[] args) {
        // loops from 1 until x reaches 10
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }

        // loops from 10 until x reaches 1
        for (int x = 10; x >= 1; x--) {
            System.out.println(x);
        }

        // asks for user input and counts until x reaches user number
        int userNumber = intInput("Enter a number to count up to: ");
        for (int x = 1; x <= userNumber; x++) {
            System.out.println(x);
        }

        // displays even numbers between 100 and 200
        for (int x = 100; x <= 200; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }

        // displays odd numbers between 100 and 200
        for (int x = 100; x <= 200; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }

        // calculates sum of numbers between 1 and user number
        int userNumber2 = intInput("Enter a number: ");
        int sum = 0;
        for (int x = 1; x <= userNumber2; x++) {
            sum += x;
        }
        System.out.println("The sum of numbers from 1 to " + userNumber2 + " is " + sum);

        // loops for the nest 15 leap years
        int lastLeapYear = intInput("Enter the last leap year: ");
        for (int x = 0; x < 15; x++) {
            int nextLeapYear = lastLeapYear += 4;
            System.out.println(nextLeapYear);
        }

        // loops from 0 to 100 and prints a message for each number that is divisible by 5
        for (int x = 0; x <= 100; x++) {
            if (x % 5 == 0) {
                System.out.println(x + " is divisible by 5.");
            }
        }

        // prints 10 random number between 1 and 5
        Random rand = new Random();
        for (int x = 0; x < 10; x++) {
            int randomNumber = rand.nextInt(5) + 1;
            System.out.println(randomNumber);
        }

        // asks user for number of assignments and core for each assignment
        int numberOfAssignments = intInput("How many assignments do you have? ");
        double totalScore = 0;
        for (int x = 1; x <= numberOfAssignments; x++) {
            double score = doubleInput("Enter the score for assignment " + x + ": ");
            totalScore += score;
        }
        // calculates average
        double averageScore = totalScore / numberOfAssignments;
        System.out.println("Average score: " + averageScore);

        // asks user for u=numbers 10 times and returns the highest number of those 10 given
        int max = Integer.MIN_VALUE;
        for (int x = 0; x < 10; x++) {
            int userNumber3 = intInput("Enter a number: ");
            if (userNumber3 > max) {
                max = userNumber3;
            }
        }
        System.out.println("The largest number is " + max);
    }
}
