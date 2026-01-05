/*
 * Author: Jaymark Vicente
 * Description:
 * This class handles the Student Authentication menu
 * such as Login, Signup, Back to Main Menu, and Exit.
 * Beginner-friendly version with detailed comments.
 */

package com.main.app.StudentLogin;

// Importing required classes
import com.main.app.StudentLogin.Signup;
import com.main.app.StudentLogin.Login;
import com.main.app.Users.UserManager;
import com.main.app.Utils.Clear;
import com.main.app.Utils.Pause;
import com.main.app.Output;
import java.util.Scanner;
import com.main.app.Validations.ValidateChoice;

public class StudentAuth {

    // Scanner for reading user input (yes/no confirmation)
    private static final Scanner SC = new Scanner(System.in);

    // Title/header text
    private static String header = "WELCOME TO STUDENT GRADING SYSTEM IN JAVA";

    // Gets the length of the header text
    private static final int titleLength = header.length();

    // Creates a border line based on header length
    private static final String BORDER = "=".repeat(titleLength + 10);

    // Utility class for clearing the console screen
    private static final Clear clear = new Clear();

    // Output class (used to go back to main menu)
    private static final Output output = new Output();

    // Class that validates numeric menu input
    private static final ValidateChoice input = new ValidateChoice();
    private static final Pause pause = new Pause();
    
    /*
     * This method is called when the user chooses
     * "Login as Student" from the main menu.
     */
    public static void loginAsStudent() {

        // UserManager handles user data (login/signup)
        UserManager userManager = new UserManager();
        
        // Infinite loop so menu keeps showing
        while (true) {
            int choice = getMenuChoice();      // Get user menu choice
            handleChoice(choice, userManager); // Handle chosen option
        }
    }

    /*
     * Prints the header with borders
     * Used to make UI look cleaner
     */
    private static void printHeader(String message) {
        System.out.println(BORDER);
        System.out.println(message);
        System.out.println(BORDER);
        System.out.println();
    }

    /*
     * Displays the student menu
     * and asks the user to choose an option
     */
    private static int getMenuChoice() {

        // Clear the console screen
        clear.screen();

        // Display header
        printHeader(header);

        // Student menu options
        System.out.println("==== STUDENT LOGIN ====");
        System.out.println(" [1] Login");
        System.out.println(" [2] Signup");
        System.out.println(" [3] Back to Main Menu");
        System.out.println(" [4] Exit");
        System.out.println(BORDER);
        
        // Validate and return the user's choice
        int choice = input.validateChoice("Enter your choice: ");
        return choice;
    }

    /*
     * Executes logic based on user's menu choice
     */
    private static void handleChoice(int choice, UserManager userManager) {

        switch (choice) {

            // Student Login
            case 1 -> Login.loginStudent(userManager);

            // Student Signup
            case 2 -> Signup.registerStudent(userManager);

            // Go back to main menu
            case 3 -> {
                System.out.println("Returning to Main Menu...");
                pause.screen();
                clear.screen();
                output.display();
            }

            // Exit the program
            case 4 -> {
                if (confirmExit()) {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            }
        }
    }

    /*
     * Confirms if the user really wants to exit
     * Accepts only "yes" or "no"
     */
    private static boolean confirmExit() {

        while (true) {
            System.out.print("Confirm Exit? (yes/no): ");

            // Read user input and convert to lowercase
            String input = SC.nextLine().trim().toLowerCase();

            switch (input) {
                case "yes" -> {
                    return true;  // Exit confirmed
                }
                case "no" -> {
                    return false; // Cancel exit
                }
                default -> {
                    System.out.println("Error: Input should be 'yes' or 'no'.");
                }
            }
        }
    }
}