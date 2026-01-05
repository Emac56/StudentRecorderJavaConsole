package com.main.app.AdminLogin;

import java.util.Scanner;

public class ChangePassword {
    private static Scanner sc = new Scanner(System.in);

    public static void changePassword(Admin admin) {
        System.out.println("\n==== CHANGE ADMIN PASSWORD ====");
        System.out.print("Enter current password: ");
        String current = sc.nextLine();

        if (!admin.checkAdminPass(current)) {
            System.out.println("Incorrect current password!");
            System.out.println("Press Enter to continue...");
            sc.nextLine();
            return;
        }

        System.out.print("Enter new password: ");
        String newPass = sc.nextLine();
        admin.setAdminPassword(newPass);
        System.out.println("Password updated successfully!");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
    }
}