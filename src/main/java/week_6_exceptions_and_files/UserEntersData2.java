package week_6_exceptions_and_files;

import java.util.List;

import static input.InputUtils.stringInput;

public class UserEntersData2 {
    public static void main(String[] args) {
        List<String> windowsVersions = List.of("XP", "7", "8", "10");
        String windowsVersionsStrings = String.join(", ", windowsVersions);

        String version = stringInput("Enter your version of windows from these: " + windowsVersionsStrings.toUpperCase());

        while (!windowsVersions.contains(version.toUpperCase())) {
            version = stringInput("Version not recognized. Enter one of these versions: " + windowsVersionsStrings.toUpperCase());
        }
        System.out.println("Windows version is " + version.toUpperCase());
    }
}
