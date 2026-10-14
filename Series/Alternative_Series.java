package Series;
import java.io.*;
import java.util.*;
public class Alternative_Series {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of terms : ");
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.print(-i + " ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
