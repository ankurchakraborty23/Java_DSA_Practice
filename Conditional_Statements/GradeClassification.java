package Conditional_Statements;
import java.util.*;
public class GradeClassification {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks :");
        int marks = in.nextInt();
        if(marks >= 0 && marks <= 100) {
            if(marks >= 90) {
                System.out.println("Grade A");
            }else if(marks >= 75 && marks <= 89) {
                System.out.println("Grade B");
            }else if(marks >= 60 && marks <= 74) {
                System.out.println("Grade C");
            }else if(marks >= 40 && marks <= 59) {
                System.out.println("Grade D");
            }else {
                System.out.println("Fail");
            }
        }else {
            System.out.println("Invalid marks");
        }
    }
}
