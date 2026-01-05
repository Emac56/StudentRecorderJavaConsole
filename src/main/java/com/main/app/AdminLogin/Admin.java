package com.main.app.AdminLogin;

public class Admin {
    private String adminUsername;
    private String adminPassword;

    // Default admin
    public Admin() {
        this.adminUsername = "Admin123";
        this.adminPassword = "1234";
    }

    // Getters & Setters
    public String getAdminUsername() {
        return adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    // Check password
    public boolean checkAdminPass(String pass) {
        return this.adminPassword.equals(pass);
    }
}