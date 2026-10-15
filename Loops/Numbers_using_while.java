package Loops;
import java.util.*;
public class Numbers_using_while {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n = in.nextInt();
        int i = 1;
        while(i <= n) {
            System.out.print(i+ " ");
            i++;
        }
    }
}
