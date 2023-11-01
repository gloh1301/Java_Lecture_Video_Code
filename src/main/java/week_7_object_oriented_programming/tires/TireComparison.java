package week_7_object_oriented_programming.tires;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;

public class TireComparison {
    public static void main(String[] args) {
//        Tire example = new Tire("Bridgestone", 50, 10000);
//        System.out.println(example.pricePer1000Miles());
//        System.out.println(example);
        List<Tire> tireList = new ArrayList<>();

        do {
            Tire tire = getTireInfo();
            tireList.add(tire);
        } while (yesNoInput("More tires to add to compare? "));

        Collections.sort(tireList);
        printReportTable(tireList);
    }

    public static Tire getTireInfo() {
        String name = stringInput("Enter name of tire: ");
        double price = positiveDoubleInput("Enter price of " + name + ": ");
        int mileWarranty = positiveIntInput("Enter number of miles warranty: ");
        Tire tire = new Tire(name, price, mileWarranty);
        return tire;
    }

    public static void printReportTable(List<Tire> tireList) {
        for (Tire tire: tireList) {
            System.out.println(tire + "Cost per set of 4 tires is $" + tire.costPerSet());
        }
    }
}
