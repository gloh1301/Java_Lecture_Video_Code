package week_5_hash_maps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {
        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        System.out.println(snowfall);

        snowfall.put("February", 12.4);

        System.out.println("The snowfall in January is " + snowfall.get("January") + " inches");

        System.out.println("The snowfall in July is " + snowfall.get("July") + " inches");

        if (snowfall.containsKey("July")) {
            System.out.println("There was snow in July!");
        } else {
            System.out.println("There was now snowfall in July.");
        }

        double total = 0;
        for (double snow: snowfall.values()) {
            total += snow;
        }
        System.out.println("The total snow is " + total + " inches");

        for (String month: snowfall.keySet()) {
            double snow = snowfall.get(month);
            System.out.println("The snowfall in " + month + " is " + snow + " inches");
        }

        String newMonth = stringInput("Enter a new month: ");
        double newSnow = doubleInput("Enter amount of snow for " + newMonth + ": ");


        Double snow = snowfall.get(newMonth);
        if (snow == null) {
            snowfall.put(newMonth, newSnow);
        } else {
            System.out.println("The hashmap already contains " + newMonth + " with snow " + snow + " inches");
            boolean overwrite = yesNoInput("Overwrite data? ");
            if (overwrite) {
                snowfall.put(newMonth, newSnow);
            } else {
                System.out.println("Data was not added");
            }
        }

        System.out.println(snowfall);
    }
}
