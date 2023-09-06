package week_1_if_else;

import static input.InputUtils.doubleInput;
import static input.InputUtils.stringInput;

public class FirstIfStatement {
    public static void main(String[] args) {
        String message = stringInput("Enter some text: ");
        System.out.println("Your message is " + message);

        double price = doubleInput("What is the price of chips? ");

        if (price < 0) {
            System.out.println("Price can't be negative");
        } else if (price == 0) {
            System.out.println("Its free!");
        } else {
            System.out.println("Price is $" + price);
        }
    }
}
