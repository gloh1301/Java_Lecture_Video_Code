package week_6_exceptions_and_files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThrowsFromMethod {
    public static void main(String[] args) {
        String fileName = "not_exists.txt";

        try {
            List<String> data = readFromFile(fileName);
            System.out.println(data);
        }
        catch (FileNotFoundException f) {
            System.out.println("The file " + fileName + " was not found");
        }
        catch (IOException e) {
            System.out.println("Could not read from file " + fileName);
        }

    }

    private static List<String> readFromFile(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        List<String> lines = new ArrayList<>();
        String line = bufferedReader.readLine();
        while (line != null) {
            lines.add(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return lines;
    }
}
