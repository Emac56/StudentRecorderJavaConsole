package com.main.app.StudentLogin;

import com.main.app.Users.UserManager;
import com.main.app.Users.User;
import com.main.app.Utils.Clear;
import com.main.app.Utils.Pause;
import java.util.Scanner;

/**
 * Handles student login functionality.
 */
public class Login {

    private static final Scanner SC = new Scanner(System.in);
    private static final Clear CLEAR = new Clear();

    /**
     * Logs in a student using their username and password.
     *
     * @param userManager UserManager instance to check user credentials
     */
    public static void loginStudent(UserManager userManager) {

        // Prompt for username and password
        String username = prompt("Enter username: ");
        String password = prompt("Enter password: ");

        User user = userManager.getByUsername(username);
        if (user == null) {
            System.out.println("\nYou don't have an account. Please sign up first.");
            Pause.screen();
            return;
        }

        if (user.checkPassword(password)) {
            System.out.println("\nLogin Successful!");
            Pause.screen();
            return;
        }

        System.out.println("\nIncorrect password. Try again.");
        Pause.screen();
    }

    /**
     * Utility method to prompt the user and get input.
     *
     * @param message Message to display
     * @return Trimmed user input
     */
    private static String prompt(String message) {
        System.out.print(message);
        return SC.nextLine().trim();
    }
}