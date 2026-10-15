package Loops;
import java.util.*;
public class MultiplicationTable_using_for {
    public static void main(String args[]) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the number of Multiplication Table :");
         int n = in.nextInt();
         System.out.println("Enter the limit :");
         int l = in.nextInt();
         for(int i = 1; i <= l; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
         }
    }
}
