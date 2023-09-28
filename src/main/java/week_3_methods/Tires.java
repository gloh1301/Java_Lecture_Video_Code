package week_3_methods;

import static input.InputUtils.*;

public class Tires {
    public static void main(String[] args) {
        int numberOfTiresToCompare = positiveIntInput("Enter number of tires to compare: ");

        String[] tireReports = new String[numberOfTiresToCompare];
        for (int t = 0; t < numberOfTiresToCompare; t++) {
            String report = getTireInfo();
            tireReports[t] = report;
        }

        printReportTable(tireReports);
    }

    private static void printReportTable(String[] tireReports) {
        for (int t = 0; t < tireReports.length; t++) {
            System.out.println(tireReports[t]);
        }
    }

    public static String getTireInfo() {
        String tireName = stringInput("Enter name of tire: ");
        double price = doubleInput("Enter the price of the " + tireName + ":");
        double miles = doubleInput("Enter the warranty mileage for " + tireName + ":");

        double pricePerThousandMile = price / miles * 1000;
        return "The " + tireName + " tire costs $" + pricePerThousandMile + " dollars per thousand miles.";
    }
}
