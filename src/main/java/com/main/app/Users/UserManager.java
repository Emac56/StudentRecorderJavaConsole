package com.main.app.Users;

import com.main.app.AdminLogin.Admin;
import java.util.ArrayList;
import java.util.List;
public class UserManager {

    // List to store all users
    private final List<User> users = new ArrayList<>();
    
    // Single Admin object
    private Admin admin;

    /**
     * Constructor initializes the UserManager with a default Admin
     */
    public UserManager() {
        this.admin = new Admin();
    }

    // ===== Admin Getter and Setter =====
    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    // ===== User Management Methods =====

    /**
     * Adds a new user if the username is not already taken
     *
     * @param user User to add
     * @return true if added successfully, false if username already exists
     */
    public boolean addUser(User user) {
        if (getByUsername(user.getUsername()) != null) {
            return false; // Username already exists
        }
        users.add(user);
        return true;
    }

    /**
     * Retrieves a user by their username
     *
     * @param username Username to search for
     * @return User object if found, null otherwise
     */
    public User getByUsername(String username) {
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }

    /**
     * Returns the total number of users
     *
     * @return number of users
     */
    public int getUserCount() {
        return users.size();
    }

    /**
     * Returns a copy of all users
     *
     * @return List of all users
     */
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
}