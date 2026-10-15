package Loops;
import java.util.*;
public class Factorial_using_dowhile {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int fact = 1, i = 1;
        do{
            fact *= i;
            i++;
        }while(i <= n);
        System.out.println("Factorial : "+fact);
    }
}
