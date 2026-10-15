package Loops;
import java.util.*;
public class Palindrome_using_while {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be checked :");
        int n = in.nextInt();
        int n_ = n, dig, rev = 0;
        while(n_ > 0) {
            dig = n_ % 10;
            rev = rev * 10 + dig;
            n_ /= 10;
        }
        if(rev == n) {
            System.out.println(n+" is a palindrome number.");
        }else {
            System.out.println(n+" is not a palindrome number.");
        }
    }
}
