package practice;

import java.util.Random;
import static input.InputUtils.stringInput;
import static input.InputUtils.yesNoInput;

/**
 * code compiled from codespeedy.com, favtutor.com, stackoverflow.com, codeproject.com, and baeldung.com
 * via bing and adjusted by me to better fit criteria
 */
public class WhileLoopRockPaperScissors {
    static int USERSCORE = 0;
    static int COMPUTERSCORE = 0;
    static int TIES = 0;

    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            String userChoice = stringInput("Enter your choice (rock, paper, or scissors): ").toLowerCase();

            // check for a valid input from user
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input - Please enter rock, paper, or scissors");
                continue;
            }

            // 0 for rock, 1 for paper, 2 for scissors
            int computerChoice = random.nextInt(3);

            System.out.println("Computer chose " + getChoice(computerChoice));

            int result = getResult(userChoice, computerChoice);

            // adds to score based on result
            if (result == 1) {
                USERSCORE++;
                System.out.println("You win!");
            } else if (result == -1) {
                COMPUTERSCORE++;
                System.out.println("You lose.");
            } else {
                TIES++;
                System.out.println("It's a tie.");
            }

            boolean playAgain = yesNoInput("Do you want to play again?");

            // runs when the user is ready to quit and displays the scores
            if (!playAgain) {
                System.out.println("Score: You " + USERSCORE + ", Computer " + COMPUTERSCORE + ", Ties " + TIES + ".");
                break;
            }
        }
    }

    // gets computer choice
    public static String getChoice(int choice) {
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
        }
        return "";

        // alternate way to write expression
//        return switch (choice) {
//            case 0 -> "rock";
//            case 1 -> "paper";
//            case 2 -> "scissors";
//            default -> "";
//        };
    }

    // gets result by comparing user choice to the computer choice
    public static int getResult(String userChoice, int computerChoice) {
        if (userChoice.equals(getChoice(computerChoice))) {
            return 0;
        } else if (userChoice.equals("rock")) {
            return computerChoice == 1 ? -1 : 1;
        } else if (userChoice.equals("paper")) {
            return computerChoice == 2 ? -1 : 1;
        } else { // userChoice.equals("scissors")
            return computerChoice == 0 ? -1 : 1;
        }
    }
}
