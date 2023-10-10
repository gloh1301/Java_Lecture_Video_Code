package week_5_hash_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTrip {
    public static void main(String[] args) {
        Map<String, Integer> distances = Map.of(
                "Duluth", 154,
                "Stillwater", 26,
                "Brainerd", 127,
                "Ely", 245,
                "Red Wing", 54);

        System.out.println(distances);

        int maxDrivingDistance = positiveIntInput("How far would you like to drive? ");

        List<String> citiesInRange = new ArrayList<>();

        for (String city: distances.keySet()) {
            int distance = distances.get(city);
            if (distance <= maxDrivingDistance) {
                // System.out.println(city + " is " + distance + " miles away.");
                citiesInRange.add(city);
            }
        }

        if (citiesInRange.isEmpty()) {
            System.out.println("Sorry, no cities in range");
        } else {
            System.out.println("Cities in range " + citiesInRange.size());
            for (String city: citiesInRange) {
                System.out.println(city);
            }
        }
    }
}
