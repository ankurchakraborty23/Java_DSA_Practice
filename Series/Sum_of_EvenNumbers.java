package Series;
import java.io.*;
import java.util.*;
public class Sum_of_EvenNumbers {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of terms :");
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of even numbers is : "+sum);
    }
}
