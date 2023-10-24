package week_6_exceptions_and_files;

import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException {

        String fileName = "data.txt";
        String name = "Grant";
        String favoriteColor = "purple";
        int classCode = 2454;

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write(name + "\n");
        bufferedWriter.write(favoriteColor);
        bufferedWriter.newLine();
        bufferedWriter.write(classCode + "\n");

        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
