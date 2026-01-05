package com.main.app.Validations;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.main.app.Utils.Clear;
import com.main.app.Utils.Pause;

public class ValidateChoice {
static Clear clear = new Clear();
    static Pause pause = new Pause();

public int validateChoice(String msg) {  
      
    Scanner SC = new Scanner(System.in);        
    boolean run = false;  
    while (!run) {  
        try {  
            System.out.print(msg);  
            String choice = SC.nextLine();  
            if (choice.isEmpty()) {  
                System.out.println("Input should not be empty.");
                pause.screen();                
                SC.nextLine();
                return 0;  
            } else {  
                return Integer.parseInt(choice);  
            }                             
        } catch (NumberFormatException e) {  
            System.out.println("Please select a valid a number");
            pause.screen();            
            SC.nextLine();  
            return 0;  
            //run = false;  
        }  
    }  
    return 0;  
}

}