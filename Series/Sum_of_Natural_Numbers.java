package Series;
import java.io.*;
import java.util.*;
public class Sum_of_Natural_Numbers {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the limit :");
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("The sum of natural numbers is : "+sum);
    }
}
