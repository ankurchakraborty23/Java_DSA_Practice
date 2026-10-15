package Loops;
import java.util.*;
public class Count_digits_using_while {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();
        int c = 0,n_ = n , dig;
        while(n_ > 0 ) {
            dig = n_ % 10;
            c++;
            n_ /= 10;
        }
        System.out.println("The number of digit of "+n+" is : "+c);
    }
}
