package week_6_exceptions_and_files;

public class StringToInt {
    public static void main(String[] args) {

        String hopeThisIsANumber = "cat";

        try {
            int number = Integer.parseInt(hopeThisIsANumber);
            System.out.println("The number is " + number);
        } catch (NumberFormatException e) {
            System.out.println(hopeThisIsANumber + " is not a valid integer string. ");
        }

        System.out.println("End of Program");
    }
}
