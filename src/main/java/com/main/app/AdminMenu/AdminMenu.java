package com.main.app.AdminMenu;

import com.main.app.AdminLogin.Admin;
import com.main.app.Validations.ValidateChoice;
import com.main.app.Utils.Clear;
import com.main.app.Users.UserManager;
import com.main.app.Students.StudentManager;

public class AdminMenu {

    // Header text displayed at the top of the menu
    private static final String HEADER = "WELCOME TO STUDENT GRADING SYSTEM IN JAVA";

    // Border line based on header length for consistent UI
    private static final String BORDER = "=".repeat(HEADER.length() + 10);

    // Core objects used by the admin menu
    private UserManager userManager;
    private Admin admin;
    private StudentManager studentManager;

    // Constructor: initializes required managers and admin instance
    public AdminMenu(UserManager userManager) {
        this.userManager = userManager;
        this.admin = userManager.getAdmin();
        this.studentManager = new StudentManager();
    }

    // Displays the admin menu and handles user interaction
    public void display() {

        // Utility classes
        ValidateChoice choice = new ValidateChoice();
        Clear clear = new Clear();

        // Menu handler for admin actions
        SelectMenu menu = new SelectMenu(studentManager);

        // Controls the menu loop
        boolean loop = false;

        // Keep showing menu until admin chooses to logout
        while (!loop) {

            // Clear the console screen
            clear.screen();

            // Display menu header
            System.out.println(BORDER);
            System.out.println(HEADER);
            System.out.println(BORDER);

            // Display logged-in admin username
            System.out.println("Username: " + admin.getAdminUsername());
            System.out.println();

            // Display admin options
            System.out.println("==== ADMIN MENU ====");
            System.out.println(" [1] Add Student");
            System.out.println(" [2] Remove Student");
            System.out.println(" [3] View All Student");
            System.out.println(" [4] Enter/Update Student Grade");
            System.out.println(" [5] View Student Grades");
            System.out.println(" [6] Number of Students");
            System.out.println(" [7] Logout");
            System.out.println(BORDER);

            // Get validated user input
            int c = choice.validateChoice("Enter your choice: ");

            // Exit loop if logout option is selected
            if (c == 7) {
                loop = true;
            }

            // Execute selected menu action
            menu.userChoice(c);
        }
    }
}