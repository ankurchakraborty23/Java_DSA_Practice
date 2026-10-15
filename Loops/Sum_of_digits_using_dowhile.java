package Loops;
import java.util.*;
public class Sum_of_digits_using_dowhile {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int sum = 0, dig, n_ = n;
        do{
            dig = n_ % 10;
            sum += dig;
            n_ /= 10;
        }while(n_ > 0);
        System.out.println("Sum of digits of "+n+" is : "+sum);
    }
}
