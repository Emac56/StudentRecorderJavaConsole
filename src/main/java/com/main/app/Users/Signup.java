package com.main.app.Users;

import java.util.Scanner;

public class Signup {

    private static final Scanner SC = new Scanner(System.in);

    public static void registerUser(UserManager userManager) {
        System.out.println("\n=== REGISTER NEW USER ===");

        String firstname = prompt("Enter your Firstname: ");
        String lastname  = prompt("Enter your Lastname: ");
        String username  = prompt("Enter your Username: ");
        String password  = prompt("Enter your Password: ");

        User newUser = new User(firstname, lastname, username, password);

        if (userManager.addUser(newUser)) {
            System.out.println("Successfully created an account!");
        } else {
            System.out.println("Username already exists. Try a different one.");
        }
    }

    // Utility method to prompt user input
    private static String prompt(String message) {
        System.out.print(message);
        return SC.nextLine().trim();
    }
}