package week_4_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        List<String> classNames = new ArrayList<>();

        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        Collections.shuffle(classNames);

        String alphabeticalFirst = Collections.min(classNames);
        System.out.println(alphabeticalFirst);
    }
}
