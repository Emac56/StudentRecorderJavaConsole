package com.main.app.AdminLogin;

import java.util.Scanner;

public class ChangeUsername {
    private static Scanner sc = new Scanner(System.in);

    public static void changeUsername(Admin admin) {
        System.out.println("\n==== CHANGE ADMIN USERNAME ====");
        System.out.print("Enter new username: ");
        String newUsername = sc.nextLine();
        admin.setAdminUsername(newUsername);
        System.out.println("Username updated successfully!");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
    }
}