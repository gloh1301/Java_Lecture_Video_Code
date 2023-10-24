package week_6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariables {
    public static void main(String[] args) throws IOException {
        int classCode = 2454;
        double averageEnrollment = 22.16;
        String className = "Java";

        FileWriter writer = new FileWriter("java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Class name: " + className + "\n");
        bufferedWriter.write("Class code: " + classCode + "\n");
        bufferedWriter.write("Average class enrollment: " + averageEnrollment + "\n");

        // writer.close();
        bufferedWriter.close();
    }
}
