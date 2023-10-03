package practice;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

public class IfStatements {
    public static void main(String[] args) {
//        int userNumber = intInput("Enter a number: ");
//        if (userNumber > 100) {
//            System.out.println("Your number is greater than 100");
//        }
//
//        int userNumber2 = intInput("Enter a number: ");
//        if (userNumber2 > 100) {
//            System.out.println("Your number is greater than 100");
//        } else {
//            System.out.println("Your number is less than or equal to 100");
//        }
//
//        int userNumber3 = intInput("Enter a number: ");
//        if (userNumber3 >= 100) {
//            System.out.println("Your number is greater than or equal to 100");
//        }
//
//        int userNumber4 = intInput("Enter a number: ");
//        if (userNumber4 > 100) {
//            System.out.println("Your number is greater than 100");
//        } else if (userNumber4 == 100) {
//            System.out.println("Your number is equal to 100");
//        } else {
//            System.out.println("Your number is less than 100");
//        }
//
//        boolean valueOfTrue = true;
//
//        boolean valueOfFalse = false;

        String name = stringInput("Enter your name: ");
        if (name.length() > 5) {
            System.out.println("Your name has more than 5 letter in it.");
        }

        String name2 = stringInput("Enter your name: ");
        if (name2.length() % 2 == 0) {
            System.out.println("Your name has an even number of letters in it.");
        }

        int quizAnswer = intInput("What year did the nintendo switch launch? ");
        if (quizAnswer == 2017) {
            System.out.println("Correct");
        } else {
            System.out.println("Sorry correct answer is 2017");
        }
    }
}
