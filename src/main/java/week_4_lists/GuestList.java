package week_4_lists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;

public class GuestList {
    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();

        // loop until user no longer wants to add guests
        while (true) {
            String name = stringInput("Enter name of guest or press enter to quit: ");

            // when no name is entered program moves on
            if (name.isEmpty()) {
                break;
            }

            // adds guest to list unless name is already present
            if (containsIgnoresCase(guestList, name)) {
                System.out.println("You already entered " + name);
            } else {
                System.out.println("Added " + name + " to list.");
                guestList.add(name);
            }
        }

        // sorts guest list alphabetically
        Collections.sort(guestList);

        printGuestNames(guestList);

        // loop for if user wants to remove any guests
        while (yesNoInput("Do you want to remove any guests? ")) {
            System.out.println("Here are all the guests: ");
            printGuestNames(guestList);

            // if there are no more guests in the list program will move on
            if (guestList.isEmpty()) {
                System.out.println("No more guests to remove");
                break;
            }

            int index = positiveIntInput("Enter guest number to remove: ");
            index--;
            // checks to make sure user enters a valid guest number
            if (index < guestList.size()) {
                String removedGuest = guestList.remove(index);
                System.out.println("Removed guest " + removedGuest);
            } else {
                System.out.println("Error - Enter a valid guest number");
            }
        }

        printGuestNames(guestList);

        System.out.println("The number of guests in the guest list is " + guestList.size());

        selectPrizeWinner(guestList);

    }

    // checks to see who the prize winner is or if no guests are available then lets the user know
    private static void selectPrizeWinner(List<String> guests) {
        if (guests.isEmpty()) {
            System.out.println("No guests available to win prize");
            return;
        }
        Random rng = new Random();
        int randomGuestIndex = rng.nextInt(guests.size());
        String prizeWinner = guests.get(randomGuestIndex);

        System.out.println("Guest number " + (randomGuestIndex+1) + " " + prizeWinner + " wins a prize!");
    }

    // method for printing guest names
    public static void printGuestNames(List<String> guests) {
        System.out.println("Your guest list is: ");

        if (guests.isEmpty()) {
            System.out.println("There are no guests in the list.");
        } else {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println((i + 1) + ": " + guests.get(i));
            }
        }
    }

    // case ignored for duplicate value handling
    public static boolean containsIgnoresCase(List<String> list, String data) {
        for (String item: list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }
}
