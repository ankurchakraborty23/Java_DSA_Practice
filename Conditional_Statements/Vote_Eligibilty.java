package Conditional_Statements;
import java.util.*;
public class Vote_Eligibilty {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age of person : ");
        int n = in.nextInt();
        if(n >= 18) {
            System.out.println("Person is eligible for vote.");
        }else {
            System.out.println("Person is not eligible for vote.");
        }
    }
}
