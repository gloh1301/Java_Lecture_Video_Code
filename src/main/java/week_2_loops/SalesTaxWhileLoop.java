package week_2_loops;

import java.text.NumberFormat;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class SalesTaxWhileLoop {
    public static void main(String[] args) {
        boolean moreCalculations = true;
        double price;
        double salesTax = 1.07;

        while (moreCalculations) {
            price = doubleInput("Type in a price: ");
            double priceWithTax = price * salesTax;

            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
            String formattedPrice = currencyFormatter.format(priceWithTax);

            System.out.println("The price with sales tax is " + formattedPrice);

            moreCalculations = yesNoInput("Do you want to do another calculation?");
        }
        System.out.println("Thanks for using the program. Goodbye.");
    }
}
