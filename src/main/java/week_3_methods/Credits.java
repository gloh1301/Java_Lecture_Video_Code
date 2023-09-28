package week_3_methods;

import static input.InputUtils.intInput;

public class Credits {
    public static void main(String[] args) {
        int required = intInput("How many credits does your program require? ");
        int earned = intInput("How many credits have you earned? ");
        int needed = howManyCreditsToGraduate(required, earned);
        System.out.println("You need " + needed + " needed credits.");
    }

    public static int howManyCreditsToGraduate(int creditsNeeded, int creditsEarned) {
        int creditsToGraduate = creditsNeeded - creditsEarned;
        return creditsToGraduate;
    }
}
