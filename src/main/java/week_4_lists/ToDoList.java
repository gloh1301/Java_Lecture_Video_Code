package week_4_lists;

import java.util.ArrayList;
import java.util.List;
import static input.InputUtils.stringInput;

public class ToDoList {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();

        while (true) {
            String data = stringInput("Type a task you need to do or press enter to quit: ");
            if (data.isEmpty()) {
                break;
            }
            if (containsIgnoresCase(todoList, data)) {
                System.out.println("You already added that.");
            } else {
                todoList.add(data);
            }
        }
        System.out.println("Thanks. Your tasks are: ");

        for (String input: todoList) {
            System.out.println(input);
        }
        System.out.println("Number of todo tasks: " + todoList.size());
    }

    public static boolean containsIgnoresCase(List<String> list, String data) {
        for (String item: list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }
}
