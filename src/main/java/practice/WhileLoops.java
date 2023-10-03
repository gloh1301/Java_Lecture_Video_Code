package practice;

import java.util.Random;
import static input.InputUtils.*;

public class WhileLoops {
    public static void main(String[] args) {
//        while (true) {
//            System.out.println("Hello");
//        }

        while (true) {
            boolean userResponse = yesNoInput("Would you like to see a random number? ");
            if (userResponse) {
                Random random = new Random();
                int randomNumberBetween1and10 = random.nextInt(10) + 1;
                System.out.println("Random number between 1 and 10: " + randomNumberBetween1and10);
            } else {
                break;
            }
        }

        // found similar code on stack overflow and adjusted for different question
        String correctAnswer = "Mercury";
        String userAnswer;
        do {
            userAnswer = stringInput("What planet is closest to the sun?");
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("You are correct!");
            } else {
                System.out.println("Sorry, that's incorrect. Please try again.");
            }
        } while (!userAnswer.equalsIgnoreCase(correctAnswer));

        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;
        int userGuess;
        do {
            userGuess = intInput("Guess a number between 1 and 10: ");
            if (userGuess < numberToGuess) {
                System.out.println("Too low");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high");
            }
        } while (userGuess != numberToGuess);
        System.out.println("Correct number");
    }
}
