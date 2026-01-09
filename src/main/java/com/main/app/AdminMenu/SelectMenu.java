package com.main.app.AdminMenu;
import com.main.app.Output;
import com.main.app.Students.StudentManager;
import java.util.Scanner;
public class SelectMenu {
    private Output output = new Output();
    private StudentManager studentManager;
    public SelectMenu(StudentManager studentManager) {
        this.studentManager = studentManager;
    }
public void userChoice(int choice) {

    StudentCount c = new StudentCount(studentManager);
    AddStudent addStudent = new AddStudent(studentManager);
    Scanner s = new Scanner(System.in);
    switch (choice) {  
        case 1 -> addStudent.add();  
        //case 2 -> //Remove Student  
        //case 3 -> //View All Student  
        //case 4 -> //Enter/Update Grade  
        //case 5 -> //View Student Grade  
        case 6 -> c.studentCount();
        case 7 -> output.display(); // logout  
    }  
}

}