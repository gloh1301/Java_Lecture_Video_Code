package week_6_exceptions_and_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args) {

        String fileName = "ReadNumberFromFile.java";
        int maxLineLength = 100;
        int numberOfLinesTooLong = 0;
        int lineCounter = 1;
        boolean linesTooLong = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            while (line != null) {
                if (line.length() > maxLineLength) {
                    System.out.println("Line " + lineCounter + " is too long.");
                    System.out.println(line);
                    linesTooLong = true;
                    numberOfLinesTooLong++;
                }
                lineCounter++;
                line = reader.readLine();
            }
            if (linesTooLong) {
                System.out.println("There were " + numberOfLinesTooLong + " lines that were too long");
            } else {
                System.out.println("There were no lines that were too long");
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + fileName + " because " + e);
        }

    }
}
