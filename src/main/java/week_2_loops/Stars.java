package week_2_loops;

import static input.InputUtils.positiveIntInput;

public class Stars {
    public static void main(String[] args) {

        int size = positiveIntInput("Enter size of square?");

        for (int x = 0; x < size; x++) {

            for (int y = 0; y < size; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
