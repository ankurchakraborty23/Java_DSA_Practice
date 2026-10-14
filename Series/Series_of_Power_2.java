package Series;
import java.io.*;
import java.util.*;
public class Series_of_Power_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of terms :");
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i <= n; i++) {
            System.out.print((int)(Math.pow(2, i))+" ");
        }
    }
}
