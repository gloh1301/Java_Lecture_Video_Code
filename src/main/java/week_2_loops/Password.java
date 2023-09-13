package week_2_loops;

import static input.InputUtils.stringInput;

public class Password {
    public static void main(String[] args) {
        String secretPassword = "kittens";

        System.out.println();
        String userPassword = stringInput("Enter the password: ");

        int maxGuesses = 5;

        while ( ! userPassword.equals(secretPassword) && maxGuesses > 1) {
            System.out.println("Password inncorrect");
            System.out.println("Try again");
            userPassword = stringInput("Enter password: ");
            maxGuesses--;
        }

        if (maxGuesses > 1) {
            System.out.println("Correct password");
        } else {
            System.out.println("Max number of attempts");
        }

    }
}
