package week_3_methods;

import static input.InputUtils.stringInput;

public class HelloMethods {
    public static void main(String[] args) {
        String name = stringInput("Please enter your name: ");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    }

    public static String makeGreeting(String nameMethod) {
        String greetingInMethod = "Hello " + nameMethod + "!";
        return greetingInMethod;
    }
}
