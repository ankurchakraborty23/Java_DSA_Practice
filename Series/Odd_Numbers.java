package Series;
import java.io.*;
import java.util.*;
public class Odd_Numbers {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.print(i+ " ");
            }
        }
    }
}
