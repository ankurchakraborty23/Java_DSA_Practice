package Loops;
import java.util.*;
public class Pattern_using_nestedfor {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int l = in.nextInt();
        for(int i = 1; i <= l; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
