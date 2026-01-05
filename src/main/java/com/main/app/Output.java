package com.main.app;

import java.util.Scanner;
import com.main.app.AdminLogin.AdminLogin;
import com.main.app.Users.UserManager;
import com.main.app.StudentLogin.StudentAuth;
import com.main.app.Utils.Clear;
import com.main.app.AdminLogin.AdminAuth;
import com.main.app.Validations.ValidateChoice;

public class Output {

    private static final String HEADER = "WELCOME TO STUDENT GRADING SYSTEM IN JAVA";
    private static final String BORDER = "=".repeat(HEADER.length() + 10);
    private static final Scanner SC = new Scanner(System.in);
    private static final UserManager userManager = new UserManager();
    private static final Clear clear = new Clear();
    private static final AdminAuth adminAuth = new AdminAuth(userManager);
    private static final ValidateChoice input = new ValidateChoice();
    public void display() {
        while (true) {
            int choice = getMenuChoice();
            handleChoice(choice);
        }
    }

    private int getMenuChoice() {
        clear.screen();
        printHeader();
        System.out.println("\n==== LOGIN MENU ====");
        System.out.println(" [1] Admin Menu");
        System.out.println(" [2] Student Login");
        System.out.println(" [3] Exit");
        System.out.println(BORDER);
        return input.validateChoice("Enter your choice: ");
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1 -> adminAuth.showMenu();
            case 2 -> StudentAuth.loginAsStudent();
            case 3 -> {
                if (confirmExit()) {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            }
            default -> System.out.println("Invalid choice. Try again.");
        }
    }

    private void printHeader() {
        System.out.println(BORDER);
        System.out.println(HEADER);
        System.out.println(BORDER);
    }

    private boolean confirmExit() {
        while (true) {
            System.out.print("Confirm Exit? (yes/no): ");
            String input = SC.nextLine().trim().toLowerCase();
            if (input.equals("yes")) return true;
            if (input.equals("no")) return false;
            System.out.println("Error: Input should be 'yes' or 'no'.");
        }
    }
}