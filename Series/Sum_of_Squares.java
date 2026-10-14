package Series;
import java.io.*;
import java.util.*;
public class Sum_of_Squares {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers of terms : ");
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("The sum of squares is : "+sum);
    }
}
