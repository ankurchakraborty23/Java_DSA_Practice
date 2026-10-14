package Series;
import java.io.*;
import java.util.*;
public class Multiples_of_Numbers {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number to find the multiples of :");
        int m = Integer.parseInt(br.readLine());
        System.out.println("Enter the limit :");
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++){
            System.out.print(m * i + " ");
        }
    }
}
