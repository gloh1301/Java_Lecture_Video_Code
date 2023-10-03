package week_4_lists;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {
        List<String> classNames = new ArrayList<>();

        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        System.out.println(classNames);

        // remove by value
        classNames.remove("Project Management");
        System.out.println(classNames);

        // remove by index
        classNames.remove(0);
        System.out.println(classNames);

        // set a value by index
        classNames.set(1, "Capstone");
        System.out.println(classNames);

        if (classNames.contains("C# Programming")) {
            System.out.println("List contains C# Programming");
        } else {
            System.out.println("List does not contain C# Programming");
        }

        String search = "Web Client Server";
        if (classNames.contains(search)) {
            System.out.println("List contains " + search);
        } else {
            System.out.println("List does not contain " + search);
        }

        System.out.println(classNames.size());

        classNames.clear();
        System.out.println(classNames);
        System.out.println(classNames.size());
        System.out.println(classNames.isEmpty());
    }
}
