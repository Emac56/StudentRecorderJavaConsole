package com.main.app.AdminMenu;
import com.main.app.Students.StudentManager;
import java.util.Scanner;
import com.main.app.Utils.Pause;

public class StudentCount {
    private StudentManager studentManager;
    
    public StudentCount(StudentManager studentManager) {
        this.studentManager = studentManager;
    }
    
    public void studentCount() {
        Scanner s = new Scanner(System.in);
        Pause pause = new Pause();
        
        System.out.print("Number of students enrolled: " + studentManager.getStudentCount());
        pause.screen();
    }
}
