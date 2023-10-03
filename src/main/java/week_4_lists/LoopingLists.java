package week_4_lists;

import java.util.ArrayList;
import java.util.List;

public class LoopingLists {
    public static void main(String[] args) {
        List<String> classNames = new ArrayList<>();

        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        for (String name: classNames) {
            System.out.println(name);
            // classNames.remove(0); - will cause error
        }

        System.out.println();

        for (int x = 0; x < classNames.size(); x++) {
            System.out.println(classNames.get(x));
            // classNames.remove(0);
        }

        System.out.println();

        while (!classNames.isEmpty()) {
            String name = classNames.remove(0);
            System.out.println(name);
        }

        System.out.println(classNames);
    }
}
