package Conditional_Statements;
import java.util.*;
public class Eligibility_for_job {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age of person :");
        int age = in.nextInt();
        System.out.println("Enter the marks of person :");
        int marks = in.nextInt();
        if(age >= 18) {
            if(marks >= 60 && marks <= 100) {
                System.out.println("Person is eligible for job.");
            }else {
                System.out.println("Insufficient Marks");
            }
        }else {
            System.out.println("Age requirement not satisfied.");
        }
    }
}
