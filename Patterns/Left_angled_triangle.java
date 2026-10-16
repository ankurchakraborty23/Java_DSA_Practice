package Patterns;
import java.util.*;
public class Left_angled_triangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n = in.nextInt();
        int k = n-1;
        for(int i = 1; i <= n; i++){
            for(int s = k; s >= 1; s--) {
                System.out.print(" "+" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print('*'+" ");
            }
            System.out.println();
            k--;
        }
    }
}
