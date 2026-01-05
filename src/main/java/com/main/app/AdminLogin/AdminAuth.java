package com.main.app.AdminLogin;

import java.util.Scanner;
import com.main.app.Users.UserManager;
import com.main.app.Validations.ValidateChoice;
import com.main.app.Utils.Clear;
import com.main.app.Utils.Pause;

public class AdminAuth {

    private UserManager userManager;
    private Admin admin;
    private Scanner sc = new Scanner(System.in);
    private ValidateChoice input = new ValidateChoice();
    private Clear clear = new Clear();
    private Pause pause = new Pause();

    private static final String HEADER = "WELCOME TO STUDENT GRADING SYSTEM IN JAVA - ADMIN";
    private static final String BORDER = "=".repeat(HEADER.length() + 5);

    public AdminAuth(UserManager userManager) {
        this.userManager = userManager;
        this.admin = userManager.getAdmin();
    }

    public void showMenu() {
        while (true) {
            clear.screen();
            printHeader();
            System.out.println("Username: " + admin.getAdminUsername());
            System.out.println("Password: " + admin.getAdminPassword());
            System.out.println("==== ADMIN MENU ====");
            System.out.println(" [1] Login");
            System.out.println(" [2] Change Username");
            System.out.println(" [3] Change Password");
            System.out.println(" [4] Back to Main Menu");
            System.out.println(" [5] Exit");
            System.out.println(BORDER);

            int choice = input.validateChoice("Enter your choice: ");
            if (!handleChoice(choice)) break;
        }
    }

    private boolean handleChoice(int choice) {
        switch (choice) {
            case 1 -> AdminLogin.loginAdmin(admin);
            case 2 -> ChangeUsername.changeUsername(admin);
            case 3 -> ChangePassword.changePassword(admin);
            case 4 -> {
                System.out.println("Returning to Main Menu...");
                pause.screen();
                return false;
            }
            case 5 -> {
                if (confirmExit()) System.exit(0);
            }
            default -> System.out.println("Invalid choice!");
        }
        return true;
    }

    private boolean confirmExit() {
        while (true) {
            System.out.print("Confirm exit? (yes/no): ");
            String ans = sc.nextLine().trim().toLowerCase();
            if (ans.equals("yes")) return true;
            if (ans.equals("no")) return false;
            System.out.println("Input must be 'yes' or 'no'.");
        }
    }

    private void printHeader() {
        System.out.println(BORDER);
        System.out.println(HEADER);
        System.out.println(BORDER);
    }
}