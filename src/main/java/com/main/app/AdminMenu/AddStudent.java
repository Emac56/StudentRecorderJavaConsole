package com.main.app.AdminMenu;
import java.util.Scanner;
import com.main.app.Students.StudentManager;
import com.main.app.Students.Student;
import com.main.app.Utils.Pause;
import com.main.app.Validations.ValidateChoice;

public class AddStudent {

private StudentManager studentManager;  

public AddStudent(StudentManager studentManager) {  
    this.studentManager = studentManager;  
}  

public void add() {  
    Scanner scanner = new Scanner(System.in);  
    Pause pause = new Pause();  
    ValidateChoice choice = new ValidateChoice();  

    System.out.print("Enter Student Firstname Name: ");  
    String firstName = scanner.nextLine();
    System.out.print("Enter Student Lastname Name: ");  
    String lastName = scanner.nextLine();  
    int studentId = choice.validateChoice("Enter Student Id: ");  

    Student newStudent = new Student(firstName,lastName,studentId);  

    if (studentManager.addStudent(newStudent)) {  
        System.out.println("Successfully added: " + firstName + " " + lastName);  
    } else {  
        System.out.println("Student already exists");  
    }  

    pause.screen();  
}

}