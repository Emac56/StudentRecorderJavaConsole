package com.main.app.Students;

/**
 * Represents a Student with grades.
 * Extends the basic Student class.
 */
public class StudentGrade extends Student {

    // ===== Student Grades =====
    private int midtermGrade;
    private int finalGrade;

    /**
     * Constructor to create a StudentGrade object
     *
     * @param name       Student's name
     * @param id         Student's ID
     * @param midterm    Midterm grade
     * @param finalGrade Final grade
     */
    public StudentGrade(String studentName,String firstName,String lastName, int id, int midterm, int finalGrade) {
        super(firstName,lastName,id); // initialize parent Student class
        this.midtermGrade = midterm;
        this.finalGrade = finalGrade;
    }

    // ===== Getters =====
    public int getMidtermGrade() { return midtermGrade; }
    public int getFinalGrade() { return finalGrade; }

    /**
     * Calculates the simple average of midterm and final grades
     *
     * @return average grade
     */
    public int getAverage() {
        return (midtermGrade + finalGrade) / 2;
    }

    // ===== Setters =====
    public void setMidtermGrade(int midtermGrade) { this.midtermGrade = midtermGrade; }
    public void setFinalGrade(int finalGrade) { this.finalGrade = finalGrade; }
}