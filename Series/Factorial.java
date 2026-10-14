package Series;
import java.io.*;
import java.util.*;
public class Factorial {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of terms :");
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            int fact = 1;
            for(int j = i; j >= 1; j--) {
                fact *= j;
            }
            System.out.print(fact + " ");
        }
    }
}
