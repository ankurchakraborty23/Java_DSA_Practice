package Loops;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be checked :");
        int n = in.nextInt();
        int n1_ = n, n2_ = n, dig, sum = 0, c = 0;
        while(n1_ > 0) {
            dig = n1_ % 10;
            c++;
            n1_ /= 10;
        }
        while(n2_ > 0) {
            dig = 0;
            dig = n2_ % 10;
            sum += (int)(Math.pow(dig, c));
            n2_ /= 10;
        }
        if(sum == n) {
            System.out.println(n+" is an armstrong number.");
        }else {
            System.out.println(n+" is not an armstrong number.");
        }
    }
}
