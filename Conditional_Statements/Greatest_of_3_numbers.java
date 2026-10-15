package Conditional_Statements;
import java.util.*;
public class Greatest_of_3_numbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        if(n1 > n2) {
            if(n1 > n3) {
                System.out.println(n1+" is greatest number.");
            }else {
                System.out.println(n3+" is greatest number.");
            }
        }else if(n2 > n3) {
            System.out.println(n2+" is greatest number.");
        }else {
            System.out.println(n3+" is greatest number.");
        }
    }
}
