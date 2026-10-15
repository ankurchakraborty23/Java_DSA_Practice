package Loops;
import java.util.*;
public class Sum_of_Numbers_using_for {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
            System.out.print(i+ " ");
        }
        System.out.println("\nSum of Natural Numbers : "+sum);
    }
}
