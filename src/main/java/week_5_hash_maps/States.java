package week_5_hash_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class States {
    public static void main(String[] args) {
        Map<String, String> stateAbbreviations = new TreeMap<>();
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        System.out.println(stateAbbreviations);

        System.out.println(stateAbbreviations.get("Minnesota"));
        System.out.println(stateAbbreviations.get("Iowa"));

        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);

        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }

        for (String abbreviation: stateAbbreviations.values()) {
            System.out.println(abbreviation);
        }

        String searchAbbreviation = "MI";
        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            String abbreviation = stateAbbreviations.get(stateName);
            if (abbreviation.equals(searchAbbreviation)) {
                System.out.println("Found abbreviation " + searchAbbreviation);
            }
        }

        Map<String, String> abbreviationStateNames = new HashMap<>();

        for (Map.Entry<String, String> entry: stateAbbreviations.entrySet()) {
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationStateNames.put(abbreviation, state);
        }

        System.out.println(abbreviationStateNames);

        System.out.println("There are " + stateAbbreviations.size() + " states listed");
    }
}
