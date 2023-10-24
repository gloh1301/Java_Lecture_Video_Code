package week_6_exceptions_and_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) throws IOException {

        // FileReader reader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.txt"));

//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());

//        String line = bufferedReader.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = bufferedReader.readLine();
//        }

        // same as above
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
