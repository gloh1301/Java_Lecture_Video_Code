package week_3_methods;


import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class Lemonade {


    public static void main(String[] args) {

        double lemonadeProfit = calculateProfitForProduct("lemonade");
        System.out.println("Lemonade profit = $" + lemonadeProfit);

        double cookieProfit = calculateProfitForProduct("cookies");
        System.out.println("Cookie profit = $" + cookieProfit);

        double coffeeProfit = calculateProfitForProduct("coffee");
        System.out.println("Cookie profit = $" + coffeeProfit);
    }

    public static double calculateProfitForProduct(String productName) {
        System.out.println("How much did you spend on " + productName + " supplies? ");
        double suppliesCost = doubleInput();
        System.out.println("What did you sell one " + productName + " for?");
        double salePrice = doubleInput();
        System.out.println("How many " + productName + " did you sell?");
        int productsSold = intInput();

        double profit = ( productsSold * salePrice ) - suppliesCost;
        return profit;
    }
}

