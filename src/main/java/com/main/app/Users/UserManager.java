package com.main.app.Users;

import com.main.app.AdminLogin.Admin;
import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> users = new ArrayList<>();
    private Admin admin;

    public UserManager() {
        this.admin = new Admin(); // single admin object
    }

    public Admin getAdmin() {
        return this.admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    // Example User management methods
    public boolean addUser(User user) {
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername())) return false;
        }
        users.add(user);
        return true;
    }

    public User getByUsername(String username) {
        for (User u : users) {
            if (u.getUsername().equals(username)) return u;
        }
        return null;
    }
}