package com.main.app.AdminLogin;

import java.util.Scanner;

public class AdminLogin {
    private static final Scanner sc = new Scanner(System.in);

    public static void loginAdmin(Admin admin) {
        System.out.println("\n==== ADMIN LOGIN ====");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (admin.getAdminUsername().equals(username) && admin.checkAdminPass(password)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid credentials!");
        }

        System.out.println("Press Enter to continue...");
        sc.nextLine();
    }
}