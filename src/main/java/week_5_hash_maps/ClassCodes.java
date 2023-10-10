package week_5_hash_maps;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {
        Map<Integer, String> classCodes = new HashMap<>();
        classCodes.put(2545, "Java");
        classCodes.put(2950, "IT Career Prep");
        classCodes.put(2905, "Capstone");

        for (Integer classCode: classCodes.keySet()) {
            String className = classCodes.get(classCode);
            System.out.println("ITEC " + classCode + " " + className);
        }
        System.out.println("I am taking " + classCodes.size() + " classes");

        int searchCode = 2417;
        if (classCodes.containsKey(searchCode)) {
            System.out.println(classCodes.get(searchCode) + " is in the hash map");
        } else {
            System.out.println(searchCode + " not found");
        }

        int searchCode2 = 2545;
        String className = classCodes.get(searchCode2);
        if (className == null) {
            System.out.println(searchCode2 + " not found");
        } else {
            System.out.println(className + " found in hash map");
        }

    }
}
