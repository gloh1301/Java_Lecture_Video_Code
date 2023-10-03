package practice;

public class Variables {
    public static void main(String[] args) {
        int intNumber = 6;
        double doubleNumber = 6.1234;
        String school = "MCTC";
        String language = "Java";

        System.out.println(intNumber);
        System.out.println(doubleNumber);
        System.out.println(school);
        System.out.println(language);
        System.out.println(intNumber + " " + doubleNumber + " " + school + " " + language);

        int newIntNumber = intNumber + 10;
        System.out.println(newIntNumber);

        int size = 12;
        size = 24;
        System.out.println(size);

        double newDoubleNumber = doubleNumber * 100;
        System.out.println(newDoubleNumber);

        int length = 100;
        length = 100 -10;
        System.out.println(length);

        int lengthDivided = length / 2;
        System.out.println("Length divided by 2 is " + lengthDivided);

        double intPlusDouble = intNumber + doubleNumber;
        System.out.println(intPlusDouble);

        double temp = 80;
        double tempInCelsius = (temp - 32) / 1.8;
        System.out.println(temp + "F is " + tempInCelsius + "C");

    }
}
