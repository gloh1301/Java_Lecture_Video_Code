package week_2_loops;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class LoopsGetDataForArray {
    public static void main(String[] args) {
        String[] textbooks = new String[5];

        for (int number = 0; number < textbooks.length; number++) {
            String bookname = stringInput("Enter name of textbook: ");
            textbooks[number] = bookname;
        }

        System.out.println("Here is the list of books");
        // System.out.println(Arrays.toString(textbooks));

        for (int number = 0; number < textbooks.length; number++) {
            System.out.println("Book number " + (number + 1) + " is " + textbooks[number]);
        }
    }
}
