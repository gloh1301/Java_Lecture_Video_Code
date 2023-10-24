package week_6_exceptions_and_files;

import static input.InputUtils.intInput;

public class UserEntersData {
    public static void main(String[] args) {

        int userInput;
        do {
            userInput = intInput("Please enter a number between 1 and 10: ");
        } while (userInput < 1 || userInput > 10);
        System.out.println("You entered " + userInput);
    }
}
