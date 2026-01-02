package com.main.app;

import com.main.app.Users.Signup;
import com.main.app.Users.Login;
import com.main.app.Users.UserManager;

import java.util.Scanner;

public class Main {

    private static final Scanner SC = new Scanner(System.in);
    private static final String BORDER = "=".repeat(41);

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        printHeader("WELCOME TO STUDENT GRADING SYSTEM IN JAVA");

        while (true) {
            int choice = getMenuChoice();
            handleChoice(choice, userManager);
        }
    }

    // Prints the header with a border
    private static void printHeader(String message) {
        System.out.println(BORDER);
        System.out.println(message);
        System.out.println();
    }

    // Displays the menu and reads user's choice
    private static int getMenuChoice() {
        System.out.println();
        System.out.println(" [1] Login");
        System.out.println(" [2] Signup");
        System.out.println(" [3] Exit");
        System.out.println(BORDER);

        System.out.print("Enter your choice: ");
        int choice = SC.nextInt();
        SC.nextLine();
        return choice;
    }

    // Handles menu choices
    private static void handleChoice(int choice, UserManager userManager) {
        switch (choice) {
            case 1 -> Login.loginUser(userManager);
            case 2 -> Signup.registerUser(userManager);
            case 3 -> {
                if (confirmExit()) {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            }
        }
    }

    // Confirm exit from the program
    private static boolean confirmExit() {
        while (true) {
            System.out.print("Confirm Exit? (yes/no): ");
            String input = SC.nextLine().trim().toLowerCase();

            switch (input) {
                case "yes" -> { return true; }
                case "no" -> { return false; }
                default -> System.out.println("Error: Input should be 'yes' or 'no'.");
            }
        }
    }
}