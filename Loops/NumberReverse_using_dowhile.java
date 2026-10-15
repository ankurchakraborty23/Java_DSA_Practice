package Loops;
import java.util.*;
public class NumberReverse_using_dowhile {
    public static void main(String args[]) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the number : ");
         int n = in.nextInt();
         int n_ = n, dig, rev = 0;
         do{
            dig = n_ % 10;
            rev = rev * 10 + dig;
            n_ /= 10;
         }while(n_ > 0);
         System.out.println("Reverse of "+n+" is : "+rev);
    }
}
