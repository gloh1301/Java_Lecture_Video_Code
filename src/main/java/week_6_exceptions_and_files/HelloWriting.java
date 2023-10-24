package week_6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Hello!\n");
        // bufferedWriter.newLine(); same as doing \n
        bufferedWriter.write("Hello Java students.\n");
        bufferedWriter.write("Goodbye!\n");

        bufferedWriter.close();

        FileWriter writer2 = new FileWriter("hello.txt", true); // true is append flag
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("Other data!");
        bufferedWriter2.newLine();
        bufferedWriter2.write("Hello programmers.");
        bufferedWriter2.newLine();
        bufferedWriter2.write("End of file!");
        bufferedWriter2.newLine();

        bufferedWriter2.close();
    }
}
