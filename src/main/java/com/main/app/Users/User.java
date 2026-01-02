package com.main.app.Users;

public class User {

private String firstname;  
private String lastname;  
private String username;  
private String password;  
  
// Constructor  
public User(String firstname, String lastname, String username, String password) {  
    this.firstname = firstname;  
    this.lastname = lastname;  
    this.username = username;  
    this.password = password;  
}  
  
// Getters  
public String getFirstname() { return firstname; }  
public String getLastname()  { return lastname; }  
public String getUsername()  { return username; }  

// Setters  
public void setFirstname(String firstname) { this.firstname = firstname; }  
public void setLastname(String lastname)   { this.lastname = lastname; }  
public void setPassword(String password)   { this.password = password; }  
  
// Simplified password check  
public boolean checkPassword(String pass) {  
    return this.password.equals(pass);  
}

}