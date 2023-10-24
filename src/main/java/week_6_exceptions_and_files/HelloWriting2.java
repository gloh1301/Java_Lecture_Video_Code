package week_6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting2 {
    public static void main(String[] args) throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello2.txt"))) {

            bufferedWriter.write("Hello!");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello Java students.");
            bufferedWriter.newLine();
            bufferedWriter.write("Goodbye!");
            bufferedWriter.newLine();

        } catch (IOException e) {
            System.out.println("Error writing to file " + e);
        }

        try (FileWriter writer2 = new FileWriter("hello2.txt", true);
             BufferedWriter bufferedWriter2 = new BufferedWriter(writer2)) {

            bufferedWriter2.write("Other data!");
            bufferedWriter2.newLine();
            bufferedWriter2.write("Hello programmers.");
            bufferedWriter2.newLine();
            bufferedWriter2.write("End of file!");
            bufferedWriter2.newLine();

        } catch (IOException e) {
            System.out.println("Error appending data to file " + e);
        }

    }
}
