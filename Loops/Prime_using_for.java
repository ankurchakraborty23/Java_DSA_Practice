package Loops;
import java.util.*;
public class Prime_using_for {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be checked :");
        int n = in.nextInt();
        int c = 0;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                c = 1;
            }
        }
        if(c == 1) {
            System.out.println(n+" is not a prime number.");
        }else {
                System.out.println(n+" is a prime number.");
            }
    }
}
