package com.main.app.Users;

import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> users= new ArrayList<>();
    
    public boolean addUser(User user) {
        for (User u: users) {
            if (u.getUsername().equals(user.getUsername())) {
                return false;
            }
        }
        users.add(user);
        return true;
    }
    public User getByUsername(String username) {
        for (User u: users) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }
}