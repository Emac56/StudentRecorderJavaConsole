package com.main.app.Users;

import java.util.Scanner;

public class Login {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void loginUser(UserManager userManager) {
        String username = prompt("Enter username: ");
        String password = prompt("Enter password: ");
        
        User user = userManager.getByUsername(username);
        
        if (user == null) {
            System.out.println("You don't have an account. Please sign up first.");
            return;
        }
        
        if (user.checkPassword(password)) {
            System.out.println("Login Successful!");
            return;
        }
        
        System.out.println("Incorrect password. Try again.");
        return;
    }
    private static String prompt(String message) {
        System.out.print(message);
        return scan.nextLine().trim();
    }
}