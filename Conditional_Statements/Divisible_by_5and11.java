package Conditional_Statements;
import java.util.*;
public class Divisible_by_5and11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();
        if(n % 5 == 0 && n % 11 == 0) {
            System.out.println(n+" is divisible by both 5 and 11.");
        }else {
            System.out.println(n+" is not divisible by both 5 and 11.");
        }
    }
}
