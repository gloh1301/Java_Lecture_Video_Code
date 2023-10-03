package week_4_lists;

import java.util.ArrayList;
import java.util.List;

public class RemovingInts {
    public static void main(String[] args) {
        List<Integer> classCodes = new ArrayList<>();
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);
        classCodes.add(1425);
        classCodes.add(1100);

        System.out.println(classCodes);

        // remove by index
        classCodes.remove(2);
        System.out.println(classCodes);

        // remove by an int value
        classCodes.remove(Integer.valueOf(1150));
        System.out.println(classCodes);
    }
}
