package practice;

import static input.InputUtils.*;

public class InputAndOutput {
    public static void main(String[] args) {
        String name = stringInput("What is your name? ");
        int numberOfStudents = intInput("How many students are in the class? ");
        int numberOfRooms = intInput("How many rooms are in your house or apartment? ");
        double todayTemp = doubleInput("What is the temp today in F? ");
        double pocketChange = doubleInput("How much change do yu have in your pockets? ");
        String nameOfSchool = stringInput("What school do you attend? ");
    }
}
