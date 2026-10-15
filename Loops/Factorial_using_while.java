package Loops;
import java.util.*;
public class Factorial_using_while {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();
        int fact = 1;
        int i = 1;
        while(i <= n) {
            fact *= i;
            i++;
        }
        System.out.println(n+ "'s factorial is : "+fact);
    }
}
