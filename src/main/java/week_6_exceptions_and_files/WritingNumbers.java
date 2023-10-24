package week_6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {
        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(data1);
        bufferedWriter.write(data2);
        bufferedWriter.write(data3);
        bufferedWriter.newLine();

        bufferedWriter.write(data1 + "\n");
        bufferedWriter.write(data2 + "\n");
        bufferedWriter.write(data3 + "\n");

        bufferedWriter.write(Integer.toString(data1));
        bufferedWriter.newLine();

        // \n to get it to print as string
        bufferedWriter.write(number + "\n");

        bufferedWriter.write("test");

        bufferedWriter.close();
    }
}
