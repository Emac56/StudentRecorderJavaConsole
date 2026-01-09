package com.main.app.Students;

/**
 * Represents a Student with a name and ID.
 */
public class Student {

    // ===== Student Information =====
    private String studentName,firstName,lastName;
    private int studentId;
    /**
     * Constructor to create a new Student
     *
     * @param studentName Name of the student
     * @param studentId   Unique student ID
     */
    public Student(String firstName,String lastName,int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // ===== Getters =====
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return firstName + lastName;
    }

    // ===== Setters =====
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}