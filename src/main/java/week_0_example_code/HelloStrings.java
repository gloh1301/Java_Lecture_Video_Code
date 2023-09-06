package week_0_example_code;

public class HelloStrings {
    public static void main(String[] args) {
        String name = "Grant";
        String nameUppercase = name.toUpperCase();
        System.out.println(nameUppercase);

        String nameLowercase = name.toLowerCase();
        System.out.println(nameLowercase);

        // length for number of characters in a string variable
        int charactersInName = name.length();
        System.out.println("There are " + charactersInName + " characters in your name");
    }
}
