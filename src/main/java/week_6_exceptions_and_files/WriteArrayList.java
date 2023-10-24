package week_6_exceptions_and_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        final String fileName = "ITEC_CLasses.txt";
        List<String> classNames = List.of("Java", "Web", "C#");
        List<Integer> classCodes = List.of(2545, 2568, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        for (int i = 0; i < classNames.size(); i++) {
            String name = classNames.get(i);
            int code = classCodes.get(i);
            String outputLine = "ITEC " + code + " " + name + "\n";
            bufferedWriter.write(outputLine);
        }

        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        List<String> classDescriptions = new ArrayList<>();

        String line = bufferedReader.readLine();

        while (line != null) {
            classDescriptions.add(line);
            line = bufferedReader.readLine();
        }

        System.out.println("End of the file reached");
        System.out.println(classDescriptions);
    }
}
