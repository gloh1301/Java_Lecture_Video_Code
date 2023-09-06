package week_1_if_else;

import static input.InputUtils.stringInput;

public class FirstIfStatement {
    public static void main(String[] args) {
        String message = stringInput("Enter some text: ");
        System.out.println("Your message is " + message);
    }
}
