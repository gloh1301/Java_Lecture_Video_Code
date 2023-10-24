package week_6_exceptions_and_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumberFromFile {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        String fileName = "numbers.txt";

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line = reader.readLine();

        while (line != null) {
            try {
                int number = Integer.parseInt(line);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println(line + " is not an integer, not printed. ");
            }
            line = reader.readLine();
        }

        System.out.println(numbers);
    }
}
