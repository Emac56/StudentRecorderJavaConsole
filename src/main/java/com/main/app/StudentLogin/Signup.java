package com.main.app.StudentLogin;

import com.main.app.Users.UserManager;
import com.main.app.Users.User;
import com.main.app.Utils.Pause;
import com.main.app.Utils.Clear;
import com.main.app.Students.Student;
import java.util.Scanner;

/**
 * Handles student registration functionality.
 */
public class Signup {

    private static final Scanner SC = new Scanner(System.in);

    /**
     * Registers a new student in the system.
     *
     * @param userManager UserManager instance to manage users
     */
    public static void registerStudent(UserManager userManager) {
        System.out.println("\n=== REGISTER NEW STUDENT ===");

        // Prompt for student details
        String firstname = prompt("Enter your Firstname: ");
        String lastname  = prompt("Enter your Lastname: ");
        String username  = prompt("Enter your Username: ");
        String password  = prompt("Enter your Password: ");

        User newUser = new User(firstname, lastname, username, password);
        // Attempt to add the new user
        if (userManager.addUser(newUser)) {
            System.out.println("\nSuccessfully created an account!");
            Student newStudent = new Student(firstname,lastname);
        } else {
            System.out.println("\nUsername already exists. Try a different one.");
        }

        // Pause for user to read message
        Pause.screen();
    }

    /**
     * Prompts the user and returns their input.
     *
     * @param message Message to display
     * @return Trimmed user input
     */
    private static String prompt(String message) {
        System.out.print(message);
        return SC.nextLine().trim();
    }
}