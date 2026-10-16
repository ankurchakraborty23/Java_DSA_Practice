package Patterns;
import java.util.*;
public class Right_angles_triangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
}
